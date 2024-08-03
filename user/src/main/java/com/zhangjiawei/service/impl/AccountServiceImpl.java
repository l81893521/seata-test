package com.zhangjiawei.service.impl;

import com.zhangjiawei.dto.SaveAccountReq;
import com.zhangjiawei.service.AccountService;
import org.apache.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
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
    @GlobalTransactional
    public String saveAccountNormal(SaveAccountReq saveAccountReq) {
        if (saveAccountReq.getMoney() == null) {
            throw new RuntimeException("缺少参数");
        }

        jdbcTemplate.update("insert into account_tbl(id, user_id, money, sex, information, create_time) values (?, ?, ?, ?, ?, ?)",
                1, UUID.randomUUID().toString(), saveAccountReq.getMoney(), 1, "hello world".getBytes(), LocalDateTime.now());
        if (saveAccountReq.getThrowEx()) {
            throw new RuntimeException("触发异常");
        }
        return "success";
    }

    @Override
    @GlobalTransactional
    public String saveAccountSpecificColumn(SaveAccountReq saveAccountReq) {
        if (saveAccountReq.getMoney() == null) {
            throw new RuntimeException("缺少参数");
        }
        // 不插入sex字段
        jdbcTemplate.update("insert into account_tbl(id, user_id, money, information, create_time) values (?, ?, ?, ?, ?)",
                1, UUID.randomUUID().toString(), saveAccountReq.getMoney(), "hello world".getBytes(), LocalDateTime.now());

        if (saveAccountReq.getThrowEx()) {
            throw new RuntimeException("触发异常");
        }
        return "success";
    }

    @Override
    @GlobalTransactional
    public String saveAccountAutoincrement(SaveAccountReq saveAccountReq) {
        if (saveAccountReq.getMoney() == null) {
            throw new RuntimeException("缺少参数");
        }
        // 自增
        jdbcTemplate.update("insert into account_tbl(user_id, money, sex, information, create_time) values (?, ?, ?, ?, ?)",
                UUID.randomUUID().toString(), saveAccountReq.getMoney(), 1, "hello world".getBytes(), LocalDateTime.now());

        if (saveAccountReq.getThrowEx()) {
            throw new RuntimeException("触发异常");
        }
        return "success";
    }

    @Override
    @GlobalTransactional
    public String saveAccountFunction(SaveAccountReq saveAccountReq) {
        if (saveAccountReq.getMoney() == null) {
            throw new RuntimeException("缺少参数");
        }
        // now()函数
        jdbcTemplate.update("insert into account_tbl(user_id, money, sex, information, create_time) values (?, ?, ?, ?, now())",
                UUID.randomUUID().toString(), saveAccountReq.getMoney(), 1, "hello world".getBytes());

        if (saveAccountReq.getThrowEx()) {
            throw new RuntimeException("触发异常");
        }
        return "success";
    }

    @Override
    @GlobalTransactional
    public String saveAccountNull(SaveAccountReq saveAccountReq) {
        if (saveAccountReq.getMoney() == null) {
            throw new RuntimeException("缺少参数");
        }
        // null列
        jdbcTemplate.update("insert into account_tbl(user_id, money, sex, information, create_time) values (?, ?, null, ?, ?)",
                UUID.randomUUID().toString(), saveAccountReq.getMoney(), "hello world".getBytes(), LocalDateTime.now());

        if (saveAccountReq.getThrowEx()) {
            throw new RuntimeException("触发异常");
        }
        return "success";
    }

    @Override
    @GlobalTransactional
    public String saveAccountTableSchemaAndTableName(SaveAccountReq saveAccountReq) {
        if (saveAccountReq.getMoney() == null) {
            throw new RuntimeException("缺少参数");
        }
        // tableSchema.tableName
        jdbcTemplate.update("insert into seata_client.account_tbl(user_id, money, sex, information, create_time) values (?, ?, ?, ?, ?)",
                UUID.randomUUID().toString(), saveAccountReq.getMoney(), 1, "hello world".getBytes(), LocalDateTime.now());

        if (saveAccountReq.getThrowEx()) {
            throw new RuntimeException("触发异常");
        }
        return "success";
    }

    @Override
    @GlobalTransactional
    public String saveAccountTableSchemaAndTableNameWithQuote(SaveAccountReq saveAccountReq) {
        if (saveAccountReq.getMoney() == null) {
            throw new RuntimeException("缺少参数");
        }
        // tableSchema.'tableName'
        jdbcTemplate.update("insert into seata_client.`account_tbl`(user_id, money, sex, information, create_time) values (?, ?, ?, ?, ?)",
                UUID.randomUUID().toString(), saveAccountReq.getMoney(), 1, "hello world".getBytes(), LocalDateTime.now());

        if (saveAccountReq.getThrowEx()) {
            throw new RuntimeException("触发异常");
        }
        return "success";
    }

    @Override
    @GlobalTransactional
    public String saveAccountTableSchemaWithQuoteAndTableName(SaveAccountReq saveAccountReq) {
        if (saveAccountReq.getMoney() == null) {
            throw new RuntimeException("缺少参数");
        }
        // 'tableSchema'.tableName
        jdbcTemplate.update("insert into `seata_client`.account_tbl(user_id, money, sex, information, create_time) values (?, ?, ?, ?, ?)",
                UUID.randomUUID().toString(), saveAccountReq.getMoney(), 1, "hello world".getBytes(), LocalDateTime.now());

        if (saveAccountReq.getThrowEx()) {
            throw new RuntimeException("触发异常");
        }
        return "success";
    }

    @Override
    @GlobalTransactional
    public String saveAccountTableSchemaWithQuoteAndTableNameWithQuote(SaveAccountReq saveAccountReq) {
        if (saveAccountReq.getMoney() == null) {
            throw new RuntimeException("缺少参数");
        }
        // 'tableSchema'.'tableName'
        jdbcTemplate.update("insert into `seata_client`.`account_tbl`(user_id, money, sex, information, create_time) values (?, ?, ?, ?, ?)",
                UUID.randomUUID().toString(), saveAccountReq.getMoney(), 1, "hello world".getBytes(), LocalDateTime.now());

        if (saveAccountReq.getThrowEx()) {
            throw new RuntimeException("触发异常");
        }
        return "success";
    }

    @Override
    @GlobalTransactional
    public String saveAccountMultiPk(SaveAccountReq saveAccountReq) {
        if (saveAccountReq.getMoney() == null) {
            throw new RuntimeException("缺少参数");
        }
        // 联合主键
        jdbcTemplate.update("insert into account_tbl_multi_pk(USER_ID, money, sex, information, create_time) values (?, ?, ?, ?, ?)",
                UUID.randomUUID().toString(), saveAccountReq.getMoney(), 1, "hello world".getBytes(), LocalDateTime.now());

        if (saveAccountReq.getThrowEx()) {
            throw new RuntimeException("触发异常");
        }
        return "success";
    }
}
