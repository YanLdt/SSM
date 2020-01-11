package com.yanl.service;

import com.yanl.domain.Account;

import java.util.List;

/**
 * @author: YanL
 * @time: 11:24 AM 1/8/20
 * @email: imyanl.dt@gmail.com
 * @description: 业务层接口
 */
public interface IAccountService {
    /**
     * 查找所有
     * @return
     */
    List<Account> findAll();

    /**
     * 保存账户
     * @param account
     */
    void saveAccount(Account account);
}
