package com.jxd.spring5;

/**
 * @author jxd
 * @date 2021/10/24 22:18
 */
public class User {

    private String userName;

    public User(){

    }

    public User(String userName) {
        this.userName = userName;
    }

    public void add(){
        System.out.println("User::add");
    }
}
