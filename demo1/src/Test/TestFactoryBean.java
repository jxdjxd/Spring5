package Test;

import com.jxd.spring5.Car;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试工厂Bean
 * @author jxd
 * @date 2021/10/25 9:58
 */
public class TestFactoryBean {
    @Test
    public void testFactoryBean(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("MyFactoryBean.xml");
        // 在xml中注册了一个工厂Bean
        Car car = (Car) context.getBean("myFactoryBean");
        System.out.println(car.getId());
        System.out.println(car.getColor());
    }
}
