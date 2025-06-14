package com.tcode.web.model.dto.generator;

import com.tcode.maker.meta.Meta;
import lombok.Data;

import java.io.Serializable;

/**
 * 制作代码生成器请求
 *
 * @author <a href="https://github.com/jiahe-tan-u">tanjiahe</a>
 * @from <a href="https://tanjiahe.icu">tanjiahe个人博客</a>
 */
@Data
public class GeneratorMakeRequest implements Serializable {

    /**
     * 元信息
     */
    private Meta meta;

    /**
     * 模板文件压缩包路径
     */
    private String zipFilePath;

    private static final long serialVersionUID = 1L;
}