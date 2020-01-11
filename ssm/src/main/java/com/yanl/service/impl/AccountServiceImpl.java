package com.yanl.service.impl;

import com.yanl.dao.IAccountDao;
import com.yanl.domain.Account;
import com.yanl.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: YanL
 * @Time: 20:08 2020/1/10
 * @Email: imyanl.dt@gmail.com
 * @Description: 账户的业务层实现类
 */
@Service("accountService")
public class AccountServiceImpl implements IAccountService {


    @Autowired
    private IAccountDao accountDao;

    /**
     * 业务层查询所有账户
     * @return 返回账户结果集
     */
    @Override
    public List<Account> findAll() {
        System.out.println("业务层查询所有账户执行了.....");
        List<Account> accounts = accountDao.findAll();
        for (Account account : accounts){
            System.out.println(account.toString());
        }
        System.out.println("持久层查询所有账户执行了....");
        return accounts;
    }

    /**
     * 业务层保存账户
     * @param account 要保存的账户
     */
    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层保存账户执行了.....");
        accountDao.saveAccount(account);
        System.out.println("持久层保存账户执行了....");
    }
}
