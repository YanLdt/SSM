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
 * Created with IntelliJ IDEA.
 *
 * @Author: YanL
 * @Time: 3:46 PM 1/8/20
 * @Email: imyanl.dt@gmail.com
 * @Description: TODO
 */
public class DaoTest {
    @Test
    public void testFindAll() throws Exception{
        //读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //使用工厂生产SqlSession对象
        SqlSession session = factory.openSession();
        //使用SqlSession创建DAO的代理对象
        IAccountDao accountDao = session.getMapper(IAccountDao.class);

        List<Account> accounts = accountDao.findAll();
        for(Account account : accounts){
            System.out.println(account);
        }

        session.close();
        in.close();
    }

    @Test
    public void testSaveAccount() throws Exception{
        Account account = new Account();

        account.setName("子尧");
        account.setMoney(4000d);
        InputStream in = Resources.getResourceAsStream("src/left/SqlMapConfig.xml");

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);

        SqlSession session = factory.openSession();

        IAccountDao accountDao = session.getMapper(IAccountDao.class);

        accountDao.saveAccount(account);

        //提交事务
        session.commit();
        session.close();
        in.close();

    }
}
