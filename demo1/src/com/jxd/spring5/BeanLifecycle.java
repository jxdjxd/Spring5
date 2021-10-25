package com.jxd.spring5;

/**
 * IOC中Bean对象的生命周期
 * @author jxd
 * @date 2021/10/25 10:18
 */
public class BeanLifecycle {
    private String name;

    public BeanLifecycle() {
        System.out.println("第一步 通过无参构造构造对象");
    }

    public BeanLifecycle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("第二步 通过set方法设置属性值");
    }

    public void initMethod(){
        System.out.println("第三步 执行Bean对象的init方法");
    }

    public void destroyMethod(){
        System.out.println("第四步 执行destroy方法");
    }
}
