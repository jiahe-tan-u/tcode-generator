package com.tcode.web.model.dto.file;

import lombok.Data;

import java.io.Serializable;

/**
 * 文件上传请求
 *
 * @author <a href="https://github.com/jiahe-tan-u">tanjiahe</a>
 * @from <a href="https://tanjiahe.icu">tanjiahe个人博客</a>
 */
@Data
public class UploadFileRequest implements Serializable {

    /**
     * 业务
     */
    private String biz;

    private static final long serialVersionUID = 1L;
}