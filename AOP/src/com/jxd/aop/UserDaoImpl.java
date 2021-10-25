package com.jxd.aop;

/**
 * @author jxd
 * @date 2021/10/25 14:48
 */
public class UserDaoImpl implements UserDao{
    @Override
    public int add(int a, int b) {
        System.out.println("add方法执行了");
        return a + b;
    }

    @Override
    public int mul(int a, int b) {
        return a * b;
    }
}
