package com.yanl.test;

import com.yanl.dao.IAccountDao;
import com.yanl.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @Author: YanL
 * @Time: 10:13 2020/1/11
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class MyBatisTest {
    @Test
    public void testMybatis() throws Exception{
        //从SqlMapConfig.xml读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = builder.build(in);
        //创建SqlSession
        SqlSession session = sqlSessionFactory.openSession();
        //使用工厂创建dao接口的代理对象
        IAccountDao accountDao = session.getMapper(IAccountDao.class);
        //执行操作
        List<Account> accounts = accountDao.findAll();
        for(Account account : accounts){
            System.out.println(account.toString());
        }
        session.close();
        in.close();

    }

    @Test
    public void testSaveMybatis() throws Exception{
        //从SqlMapConfig.xml读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = builder.build(in);
        //创建SqlSession
        SqlSession session = sqlSessionFactory.openSession();
        //使用工厂创建dao接口的代理对象
        IAccountDao accountDao = session.getMapper(IAccountDao.class);
        //执行操作
        Account account = new Account();
        account.setName("大帅哥");
        account.setMoney(1000d);
        accountDao.saveAccount(account);
//        session.commit();
        accountDao.findAll();
        List<Account> accounts = accountDao.findAll();
        for(Account account1 : accounts){
            System.out.println(account1.toString());
        }
        session.close();
        in.close();

    }
}
