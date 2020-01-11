package com.yanl.test;

import com.yanl.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: YanL
 * @time: 11:59 AM 1/8/20
 * @email: imyanl.dt@gmail.com
 * @description:
 */
public class ServiceTest {
    @Test
    public void testSpring() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        IAccountService accountService = ac.getBean("accountService", IAccountService.class);
        accountService.findAll();
    }
}
