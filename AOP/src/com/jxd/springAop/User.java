package com.jxd.springAop;

import org.springframework.stereotype.Component;

/**
 * 被增强的类
 * @author jxd
 * @date 2021/10/25 16:27
 */
@Component
public class User {
    public void add(){
        System.out.println("User::add");
    }
}
