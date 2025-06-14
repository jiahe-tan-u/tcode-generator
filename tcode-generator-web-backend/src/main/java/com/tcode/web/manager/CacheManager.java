package com.tcode.web.manager;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * 多级缓存
 *
 * @author <a href="https://github.com/jiahe-tan-u">tanjiahe</a>
 * @from <a href="https://tanjiahe.icu">tanjiahe个人博客</a>
 */
@Component
@Slf4j
public class CacheManager {

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    /**
     * 本地缓存
     */
    Cache<String, Object> localCache = Caffeine.newBuilder()
            .expireAfterWrite(100, TimeUnit.MINUTES)
            .maximumSize(10_000)
            .build();

    /**
     * 写入缓存
     *
     * @param key
     * @param value
     */
    public void put(String key, Object value) {
        localCache.put(key, value);
        redisTemplate.opsForValue().set(key, value, 100, TimeUnit.MINUTES);
    }

    /**
     * 读缓存
     *
     * @param key
     * @return
     */
    public Object get(String key) {
        // 先从本地缓存中获取
        Object value = localCache.getIfPresent(key);
        if (value != null) {
            log.info("本地缓存中获取");
            return value;
        }

        // 本地缓存未命中，尝试从 Redis 获取
        value = redisTemplate.opsForValue().get(key);
        if (value != null) {
            // 将 redis 的值写入到本地缓存
            localCache.put(key, value);
        }
        log.info("redis中获取并写入本地缓存");
        return value;
    }

    /**
     * 移除缓存
     *
     * @param key
     */
    public void delete(String key) {
        localCache.invalidate(key);
        redisTemplate.delete(key);
    }

    /**
     * 移除所有缓存
     */
    public void deleteAll() {
        // 遍历并删除所有缓存项
        localCache.asMap().forEach((key, value) -> localCache.invalidate(key));
//        Set<String> keys = redisTemplate.keys("*");
//        for (String key : keys) {
//            redisTemplate.delete(key);
//        }
        log.info("移除所有本地缓存");
    }
}
