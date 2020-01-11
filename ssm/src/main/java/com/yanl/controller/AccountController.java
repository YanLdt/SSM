package com.yanl.controller;

import com.yanl.domain.Account;
import com.yanl.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

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

    /**
     * 测试查找所有类
     * @return success
     */
    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Account> accounts = accountService.findAll();
        for(Account account : accounts){
            System.out.println(account.toString());
        }
        model.addAttribute("accounts", accounts);
        return "success";
    }

    /**
     * 保存账户
     */
    @RequestMapping("/saveAccount")
    public void saveAccount(Account account, HttpServletRequest request, HttpServletResponse response) throws Exception{

        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath() + "/account/findAll");

    }
}
