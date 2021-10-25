package Test;

import com.jxd.spring5.Book;
import com.jxd.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jxd
 * @date 2021/10/25 7:31
 */
public class TestSpring5 {

    @Test
    public void testAdd(){
        // 加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        // 获取配置文件中创建的对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }

    @Test
    public void testBook(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Book book1 = context.getBean("book1", Book.class);
        System.out.println(book1.getTitle());
    }

    @Test
    public void testBook1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Book book2 = context.getBean("book2", Book.class);
        System.out.println(book2.getTitle());
    }
}
