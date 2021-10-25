package Test;

import com.jxd.spring5.Car;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jxd
 * @date 2021/10/25 10:08
 */
public class TestSingleton {
    @Test
    public void testSingleton(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Singleton.xml");
        Car carSingleton = context.getBean("carSingleton", Car.class);
        Car carSingleton1 = context.getBean("carSingleton", Car.class);
        // 默认ioc容器中的对象是单例
        System.out.println(carSingleton == carSingleton1);
    }

    @Test
    public void testPrototype(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Singleton.xml");
        Car carSingleton = context.getBean("carPrototype", Car.class);
        Car carSingleton1 = context.getBean("carPrototype", Car.class);
        // 设置ioc容器中的对象是多例
        System.out.println(carSingleton == carSingleton1);
    }
}
