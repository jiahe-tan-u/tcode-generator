package com.tcode.web.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 删除请求
 *
 * @author <a href="https://github.com/jiahe-tan-u">tanjiahe</a>
 * @from <a href="https://tanjiahe.icu">tanjiahe个人博客</a>
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}