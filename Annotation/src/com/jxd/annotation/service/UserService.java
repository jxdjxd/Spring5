package com.jxd.annotation.service;

import com.jxd.annotation.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author jxd
 * @date 2021/10/25 13:48
 */
@Service
public class UserService {

    @Autowired
    @Qualifier("userDaoImpl1")
    private UserDao userDao;

    public void add(){
        System.out.println("UserService::add");
        userDao.addUser();
    }
}
