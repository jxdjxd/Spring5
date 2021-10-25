package Test;

import com.jxd.springAop.Book;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jxd
 * @date 2021/10/25 18:39
 */
public class TestBookProxy {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("book", Book.class);
        book.add();
    }
}
