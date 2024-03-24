package com.tcode.maker.generator.file;

import cn.hutool.core.io.FileUtil;

/**
 * @author 14378
 * @version 1.0
 * @description TODO
 * @date 2024/3/18 15:11
 */
public class StaticFileGenerator {

    /**
     * 拷贝文件（Hutool 实现，会将输入目录完整拷贝到输出目录下）
     * @param inputPath
     * @param outputPath
     */
    public static void copyFilesByHutool(String inputPath, String outputPath) {
        FileUtil.copy(inputPath, outputPath, false);
    }
}
