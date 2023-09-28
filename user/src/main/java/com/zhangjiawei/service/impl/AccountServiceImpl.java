package com.zhangjiawei.service.impl;

import com.zhangjiawei.service.AccountService;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: zhangjiawei
 * @date: 2023/9/28
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Override
    public String saveAccount() {
        return "HELLO";
    }
}
