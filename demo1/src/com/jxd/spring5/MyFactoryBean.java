package com.jxd.spring5;

import org.springframework.beans.factory.FactoryBean;

/**
 * 工厂Bean
 * @author jxd
 * @date 2021/10/25 9:56
 */
public class MyFactoryBean implements FactoryBean<Car> {

    @Override
    public Car getObject() throws Exception {
        return new Car("232323", "dark");
    }

    @Override
    public Class<Car> getObjectType() {
        return Car.class;
    }
}
