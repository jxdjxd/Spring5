package Test;

import com.jxd.spring5.BeanLifecycle;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jxd
 * @date 2021/10/25 10:27
 */
public class TestLifeCycle {
    @Test
    public void testBeanLifeCycle(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("LifeCycle.xml");
        BeanLifecycle lifeCycleBean = context.getBean("lifeCycleBean", BeanLifecycle.class);
        System.out.println(lifeCycleBean.getName());
        // 手动销毁实例
        context.close();
    }
}
