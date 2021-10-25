package com.jxd.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 使用JDK来创建一个接口的实现类的代理对象
 * @author jxd
 * @date 2021/10/25 14:41
 */
public class JDKProxy {
    public static void main(String[] args) {
        // 创建接口实现类的代理对象
        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao  = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        int result = dao.add(1, 2);
        System.out.println(result);
    }
}

class UserDaoProxy implements InvocationHandler {
    // 把被代理对象传递过来
    private Object obj;
    public UserDaoProxy(Object obj){
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 方法之前
        System.out.println("方法之前执行");

        Object res = method.invoke(obj, args);

        // 方法之后
        System.out.println("方法之后执行");
        return res;
    }
}
