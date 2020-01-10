package com.yanl.controller;

import com.yanl.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: YanL
 * @Time: 20:29 2020/1/10
 * @Email: imyanl.dt@gmail.com
 * @Description: 账户表现层
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountServiceImpl accountService;
    /**
     * 测试跳转
     * @return success
     */
    @RequestMapping("/testSsm")
    public String testSsm(){
        return "success";
    }

    /**
     * 测试spring和springMVC整合
     * @return success
     */
    @RequestMapping("/testSpringAndMvc")
    public String testSpringAndSpringMvc(){
        accountService.findAll();
        return "success";
    }
}
