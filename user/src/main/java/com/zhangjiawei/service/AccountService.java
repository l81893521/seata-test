package com.zhangjiawei.service;

import com.zhangjiawei.dto.SaveAccountReq;

/**
 * @description:
 * @author: zhangjiawei
 * @date: 2023/9/28
 */
public interface AccountService {

    /**
     * 保存账户
     * @param saveAccountReq
     */
    String saveAccount(SaveAccountReq saveAccountReq);
}
