package com.yanl.test;

import com.yanl.domain.Account;
import com.yanl.service.IAccountService;
import com.yanl.service.impl.AccountServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: YanL
 * @Time: 20:16 2020/1/10
 * @Email: imyanl.dt@gmail.com
 * @Description: spring框架测试类
 */
public class StringTest {
    @Test
    public void springTest() {
        //创建容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //从容器中读取service对象
        AccountServiceImpl accountService = ac.getBean("accountService", AccountServiceImpl.class);
//        Account account = new Account();
//        account.setName("大周哥");
//        account.setMoney(1000d);
//        accountService.saveAccount(account);
        accountService.findAll();
    }
}
