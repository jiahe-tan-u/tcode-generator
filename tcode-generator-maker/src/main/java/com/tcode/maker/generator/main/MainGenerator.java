package com.tcode.maker.generator.main;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.resource.ClassPathResource;
import cn.hutool.core.util.StrUtil;
import com.tcode.maker.generator.JarGenerator;
import com.tcode.maker.generator.ScriptGenerator;
import com.tcode.maker.generator.file.DynamicFileGenerator;
import com.tcode.maker.meta.Meta;
import com.tcode.maker.meta.MetaManager;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

/**
 * @author 14378
 * @version 1.0
 * @description 代码生成器
 * @date 2024/3/22 16:05
 */
public class MainGenerator extends GenerateTemplate{

    @Override
    protected void buildDist(String outputPath, String sourceCopyDestPath, String jarPath, String shellOutputFilePath) {
        System.out.println("");
    }
}
