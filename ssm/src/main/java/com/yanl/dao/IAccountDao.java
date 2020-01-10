package com.yanl.dao;

import com.yanl.domain.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: YanL
 * @Time: 20:04 2020/1/10
 * @Email: imyanl.dt@gmail.com
 * @Description: 账户持久层接口
 */

@Repository
public interface IAccountDao {

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
