package com.tcode.maker.meta.enums;

/**
 * @author 14378
 * @version 1.0
 * @description 模型类型枚举
 * @date 2024/3/24 20:45
 */
public enum ModelTypeEnum {

    STRING("字符串", "String"),
    BOOLEAN("布尔", "boolean");

    private final String text;

    private final String value;

    ModelTypeEnum(String text, String value) {
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
