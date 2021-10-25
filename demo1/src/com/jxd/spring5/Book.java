package com.jxd.spring5;

/**
 * @author jxd
 * @date 2021/10/25 8:25
 */
public class Book {
    private String title;

    public Book(){

    }

    // 通过有参构造注入属性值
    public Book(String title) {
        this.title = title;
    }

    // 通过属性的set方法注入属性值
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
