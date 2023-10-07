package com.zhangjiawei.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @description:
 * @author: zhangjiawei
 * @date: 2023/10/7
 */
@Data
public class SaveAccountReq {

    /**
     * 金钱
     */
    private BigDecimal money;

    /**
     * 是否抛出异常
     */
    private Boolean throwEx;
}
