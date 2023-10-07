package com.zhangjiawei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.groovy.template.GroovyTemplateAutoConfiguration;

/**
 * @description:
 * @author: zhangjiawei
 * @date: 2023/9/28
 */
@SpringBootApplication(exclude = GroovyTemplateAutoConfiguration.class)
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
