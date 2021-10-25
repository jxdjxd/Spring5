package com.jxd.springAop;

/**
 * Book对象的代理类(使用xml配置)
 * @author jxd
 * @date 2021/10/25 18:33
 */
public class BookProxy {

    public void before(){
        System.out.println("before......");
    }
}
