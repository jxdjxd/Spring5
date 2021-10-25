package com.jxd.springAop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 代理类
 * @author jxd
 * @date 2021/10/25 16:28
 */
@Component
@Aspect
@Order(3)
public class UserProxy {

    /**
     * 切入点的抽取
     */
    @Pointcut(value = "execution(* com.jxd.springAop.User.add(..))")
    public void pointExtract(){

    }

    @Before(value = "pointExtract()")
    public void before(){
        System.out.println("before......");
    }

    @After(value = "execution(* com.jxd.springAop.User.add(..))")
    public void after(){
        System.out.println("after......");
    }

    @AfterReturning(value = "execution(* com.jxd.springAop.User.add(..))")
    public void afterReturning(){
        System.out.println("afterReturning......");
    }

    @AfterThrowing(value = "execution(* com.jxd.springAop.User.add(..))")
    public void afterThrowing(){
        System.out.println("afterReturning......");
    }

    @Around(value = "execution(* com.jxd.springAop.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前......");
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后......");
    }
}
