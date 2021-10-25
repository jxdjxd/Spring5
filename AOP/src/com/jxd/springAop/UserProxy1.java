package com.jxd.springAop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 多个增强类对一个方法增强，使用@Order()指定优先级
 * @author jxd
 * @date 2021/10/25 17:13
 */
@Component
@Aspect
@Order(1)
public class UserProxy1 {

    @Before(value = "execution(* com.jxd.springAop.User.add(..))")
    public void before(){
        System.out.println("UserProxy1 before......");
    }
}
