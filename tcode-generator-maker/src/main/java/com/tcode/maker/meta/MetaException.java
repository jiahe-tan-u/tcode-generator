package com.tcode.maker.meta;

/**
 * @author 14378
 * @version 1.0
 * @description TODO
 * @date 2024/3/24 16:42
 */
public class MetaException extends RuntimeException{

    public MetaException(String message) {
        super(message);
    }

    public MetaException(String message, Throwable cause) {
        super(message, cause);
    }
}
