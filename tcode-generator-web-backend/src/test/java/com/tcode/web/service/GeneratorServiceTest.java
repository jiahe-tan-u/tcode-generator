package com.tcode.web.service;

import com.tcode.web.model.entity.Generator;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;

/**
 * 批量插入数据（仅单次执行）
 */
// 取消注释才能启动
//@SpringBootTest
class GeneratorServiceTest {

    @Resource
    private GeneratorService generatorService;

    @Test
    public void testInsert() {
        Generator generator = generatorService.getById(18L);
        for (int i = 0; i < 100000; i++) {
            generator.setId(null);
            generatorService.save(generator);
        }
    }

}