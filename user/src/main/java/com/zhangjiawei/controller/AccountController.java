package com.zhangjiawei.controller;

import com.zhangjiawei.dto.SaveAccountReq;
import com.zhangjiawei.dto.TestAllAccountReq;
import com.zhangjiawei.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: zhangjiawei
 * @date: 2023/9/28
 */
@Slf4j
@RestController()
@RequestMapping("/user")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/testAll")
    public String testAll(@RequestBody TestAllAccountReq testAllAccountReq) {
        StringBuilder msg = new StringBuilder();
        try {
            SaveAccountReq saveAccountReq = new SaveAccountReq();
            saveAccountReq.setMoney(testAllAccountReq.getMoney());
            saveAccountReq.setThrowEx(testAllAccountReq.getThrowEx());
            accountService.saveAccountNormal(saveAccountReq);
        } catch (Exception e) {
            log.info(e.getMessage());
            msg.append(e.getMessage());
            msg.append("\n");
        }

        try {
            SaveAccountReq saveAccountReq = new SaveAccountReq();
            saveAccountReq.setMoney(testAllAccountReq.getMoney());
            saveAccountReq.setThrowEx(testAllAccountReq.getThrowEx());
            accountService.saveAccountSpecificColumn(saveAccountReq);
        } catch (Exception e) {
            log.info(e.getMessage());
            msg.append(e.getMessage());
            msg.append("\n");
        }

        try {
            SaveAccountReq saveAccountReq = new SaveAccountReq();
            saveAccountReq.setMoney(testAllAccountReq.getMoney());
            saveAccountReq.setThrowEx(testAllAccountReq.getThrowEx());
            accountService.saveAccountAutoincrement(saveAccountReq);
        } catch (Exception e) {
            log.info(e.getMessage());
            msg.append(e.getMessage());
            msg.append("\n");
        }

        try {
            SaveAccountReq saveAccountReq = new SaveAccountReq();
            saveAccountReq.setMoney(testAllAccountReq.getMoney());
            saveAccountReq.setThrowEx(testAllAccountReq.getThrowEx());
            accountService.saveAccountFunction(saveAccountReq);
        } catch (Exception e) {
            log.info(e.getMessage());
            msg.append(e.getMessage());
            msg.append("\n");
        }

        try {
            SaveAccountReq saveAccountReq = new SaveAccountReq();
            saveAccountReq.setMoney(testAllAccountReq.getMoney());
            saveAccountReq.setThrowEx(testAllAccountReq.getThrowEx());
            accountService.saveAccountNull(saveAccountReq);
        } catch (Exception e) {
            log.info(e.getMessage());
            msg.append(e.getMessage());
            msg.append("\n");
        }

        try {
            SaveAccountReq saveAccountReq = new SaveAccountReq();
            saveAccountReq.setMoney(testAllAccountReq.getMoney());
            saveAccountReq.setThrowEx(testAllAccountReq.getThrowEx());
            accountService.saveAccountTableSchemaAndTableName(saveAccountReq);
        } catch (Exception e) {
            log.info(e.getMessage());
            msg.append(e.getMessage());
            msg.append("\n");
        }

        try {
            SaveAccountReq saveAccountReq = new SaveAccountReq();
            saveAccountReq.setMoney(testAllAccountReq.getMoney());
            saveAccountReq.setThrowEx(testAllAccountReq.getThrowEx());
            accountService.saveAccountTableSchemaAndTableNameWithQuote(saveAccountReq);
        } catch (Exception e) {
            log.info(e.getMessage());
            msg.append(e.getMessage());
            msg.append("\n");
        }

        try {
            SaveAccountReq saveAccountReq = new SaveAccountReq();
            saveAccountReq.setMoney(testAllAccountReq.getMoney());
            saveAccountReq.setThrowEx(testAllAccountReq.getThrowEx());
            accountService.saveAccountTableSchemaWithQuoteAndTableName(saveAccountReq);
        } catch (Exception e) {
            log.info(e.getMessage());
            msg.append(e.getMessage());
            msg.append("\n");
        }

        try {
            SaveAccountReq saveAccountReq = new SaveAccountReq();
            saveAccountReq.setMoney(testAllAccountReq.getMoney());
            saveAccountReq.setThrowEx(testAllAccountReq.getThrowEx());
            accountService.saveAccountTableSchemaWithQuoteAndTableNameWithQuote(saveAccountReq);
        } catch (Exception e) {
            log.info(e.getMessage());
            msg.append(e.getMessage());
            msg.append("\n");
        }

        try {
            SaveAccountReq saveAccountReq = new SaveAccountReq();
            saveAccountReq.setMoney(testAllAccountReq.getMoney());
            saveAccountReq.setThrowEx(testAllAccountReq.getThrowEx());
            accountService.saveAccountMultiPk(saveAccountReq);
        } catch (Exception e) {
            log.info(e.getMessage());
            msg.append(e.getMessage());
            msg.append("\n");
        }
        return msg.toString();
    }

    @PostMapping("/save")
    public String save(@RequestBody @Validated SaveAccountReq saveAccountReq) {
        try {
            accountService.saveAccountNormal(saveAccountReq);
        } catch (Exception e) {
            log.info(e.getMessage());
            return e.getMessage();
        }
        return "success";
    }

    @PostMapping("/saveAccountTableSchemaWithQuoteAndTableName")
    public String saveAccountTableSchemaWithQuoteAndTableName(@RequestBody @Validated SaveAccountReq saveAccountReq) {
        try {
            accountService.saveAccountTableSchemaWithQuoteAndTableName(saveAccountReq);
        } catch (Exception e) {
            log.info(e.getMessage());
            return e.getMessage();
        }
        return "success";
    }

    @PostMapping("/saveAccountMultiPk")
    public String saveAccountMultiPk(@RequestBody @Validated SaveAccountReq saveAccountReq) {
        try {
            accountService.saveAccountMultiPk(saveAccountReq);
        } catch (Exception e) {
            log.info(e.getMessage());
            return e.getMessage();
        }
        return "success";
    }
}
