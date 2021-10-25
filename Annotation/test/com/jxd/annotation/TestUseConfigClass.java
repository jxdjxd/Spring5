package com.jxd.annotation;

import com.jxd.annotation.config.SpringConfig;
import com.jxd.annotation.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 采用配置类来代替xml配置文件
 * @author jxd
 * @date 2021/10/25 14:15
 */
public class TestUseConfigClass {

    @Test
    public void testUseConfigClass(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
