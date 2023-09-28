package com.zhangjiawei.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: zhangjiawei
 * @date: 2023/9/28
 */
@RestController
public class AccountController {

    @GetMapping("/test")
    public String test() {
        return "hello";
    }
}
