package com.jxd.annotation;

import com.jxd.annotation.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jxd
 * @date 2021/10/25 13:55
 */
public class TestUserService {
    @Test
    public void testUserService(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
