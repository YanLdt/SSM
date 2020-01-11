package com.yanl.dao;

import com.yanl.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: YanL
 * @time: 11:22 AM 1/8/20
 * @email: imyanl.dt@gmail.com
 * @description: 账户持久层接口
 */


@Repository
public interface IAccountDao {

    /**
     * 查找所有
     * @return 查找的账户
     */
    @Select(value = "select * from account")
    List<Account> findAll();

    /**
     * 保存账户
     * @param account 要保存的账户
     */
    @Insert(value = "insert into account (name, money) values (#{name}, #{money})")
    void saveAccount(Account account);
}
