package com.zhangjiawei.service.impl;

import com.zhangjiawei.dto.SaveAccountReq;
import com.zhangjiawei.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;

/**
 * @description:
 * @author: zhangjiawei
 * @date: 2023/9/28
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public String saveAccount(SaveAccountReq saveAccountReq) {
        if (saveAccountReq.getMoney() == null) {
            throw new RuntimeException("缺少参数");
        }
        jdbcTemplate.update("insert into account_tbl(USER_ID, money, information, create_time) values (?, ?, ?, now())",
                UUID.randomUUID().toString(), saveAccountReq.getMoney(), "hello world".getBytes());

        return "success";
    }
}
