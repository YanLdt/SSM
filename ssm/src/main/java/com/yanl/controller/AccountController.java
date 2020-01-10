package com.yanl.controller;

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

    /**
     * 测试跳转
     * @return success
     */
    @RequestMapping("/testSsm")
    public String testSsm(){
        return "success";
    }
}
