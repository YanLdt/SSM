package com.yanl.controller;

import com.yanl.domain.Account;
import com.yanl.service.IAccountService;
import com.yanl.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: YanL
 * @Time: 1:20 PM 1/8/20
 * @Email: imyanl.dt@gmail.com
 * @Description: TODO
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountServiceImpl accountService;

    /**
     * 查找全部
     * @return list
     */
    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层查询所有....");
        List<Account> accounts = accountService.findAll();
        for(Account account : accounts){
            System.out.println(account);
        }
        model.addAttribute("accounts", accounts);
        return "success";
    }

    /**
     * 保存账户
     * @param account 提交的用户
     * @param response 响应
     * @param request 请求
     */
    @RequestMapping("/saveAccount")
    public void saveAccount(Account account, HttpServletResponse response, HttpServletRequest request) throws Exception{
        System.out.println("表现层保存账户");
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath() + "/account/findAll");
    }
}
