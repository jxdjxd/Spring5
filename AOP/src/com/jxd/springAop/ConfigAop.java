package com.jxd.springAop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author jxd
 * @date 2021/10/25 18:42
 */
@Configuration
@ComponentScan(basePackages = {"com.jxd.springAop"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {
}
