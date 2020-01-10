package com.yanl.service;

import com.yanl.domain.Account;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: YanL
 * @Time: 20:07 2020/1/10
 * @Email: imyanl.dt@gmail.com
 * @Description: 账户的业务层接口
 */

public interface IAccountService {

    /**
     * 查询所有账户
     * @return 返回所有账户
     */
    List<Account> findAll();

    /**
     * 保存账户
     * @param account 要保存的账户
     */
    void saveAccount(Account account);
}
