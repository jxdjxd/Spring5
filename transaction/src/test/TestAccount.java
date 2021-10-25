package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.TxConfig;
import service.UserService;

/**
 * @author jxd
 * @date 2021/10/25 19:47
 */
public class TestAccount {

    @Test
    public void testAccount(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.transferAccounts();
    }

    /**
     * 测试完全采用注解开发Spring Transaction
     */
    @Test
    public void testAllUseAnnotation(){
        ApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.transferAccounts();
    }
}
