package com.zhangjiawei.controller;

import com.zhangjiawei.dto.SaveAccountReq;
import com.zhangjiawei.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @description:
 * @author: zhangjiawei
 * @date: 2023/9/28
 */
@RestController()
@RequestMapping("/user")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/save")
    public String save(@RequestBody @Validated SaveAccountReq saveAccountReq) {
        try {
            accountService.saveAccount(saveAccountReq);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "success";
    }
}
