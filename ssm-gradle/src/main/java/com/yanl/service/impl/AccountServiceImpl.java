package com.yanl.service.impl;

import com.yanl.dao.IAccountDao;
import com.yanl.domain.Account;
import com.yanl.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: YanL
 * @time: 11:26 AM 1/8/20
 * @email: imyanl.dt@gmail.com
 * @description: 业务层实现类
 */


@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    @Override
    public List<Account> findAll(){
        System.out.println("业务层查询所有....");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层保存账户.....");
        accountDao.saveAccount(account);
    }
}
