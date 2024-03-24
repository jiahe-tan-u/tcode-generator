package com.tcode.maker.meta.enums;

/**
 * @author 14378
 * @version 1.0
 * @description 文件类型枚举
 * @date 2024/3/24 20:44
 */
public enum FileTypeEnum {

    DIR("目录", "dir"),
    FILE("文件", "file");

    private final String text;

    private final String value;

    FileTypeEnum(String text, String value) {
        this.text = text;
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public String getValue() {
        return value;
    }
}
