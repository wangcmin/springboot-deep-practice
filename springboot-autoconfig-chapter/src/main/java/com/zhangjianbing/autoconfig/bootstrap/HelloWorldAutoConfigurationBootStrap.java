package com.zhangjianbing.autoconfig.bootstrap;

import com.zhangjianbing.autoconfig.entity.User;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author Ryan Zhang
 * @Title: HelloWorldAutoConfiguration
 * @Description:
 * @date 2019/4/26
 * @From https://www.zhangjianbing.com
 */
@EnableAutoConfiguration // 开启自动装配注解
public class HelloWorldAutoConfigurationBootStrap {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new SpringApplicationBuilder(HelloWorldAutoConfigurationBootStrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        // 从IOC容器中获取Import注入的User对象
        User user = context.getBean(User.class);
        System.out.println(user.toString());


        context.close();
    }

}
