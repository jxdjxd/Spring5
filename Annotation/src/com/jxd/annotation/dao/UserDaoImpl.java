package com.jxd.annotation.dao;

import org.springframework.stereotype.Repository;

/**
 * @author jxd
 * @date 2021/10/25 13:47
 */
@Repository(value = "userDaoImpl1")
public class UserDaoImpl implements UserDao{
    @Override
    public void addUser() {
        System.out.println("UserDaoImpl::addUser");
    }
}
