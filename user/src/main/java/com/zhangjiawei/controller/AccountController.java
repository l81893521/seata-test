package com.zhangjiawei.controller;

import com.zhangjiawei.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: zhangjiawei
 * @date: 2023/9/28
 */
@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/test")
    public String test() {
        return accountService.saveAccount();
    }
}
