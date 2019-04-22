package com.zhangjianbing.autoconfig.bootstrap;

import com.zhangjianbing.autoconfig.annotation.EnableHelloWorld;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author Ryan Zhang
 * @Title: HelloWorldBootStrap
 * @Description:
 * @date 2019/4/22
 * @From https://www.zhangjianbing.com
 */
@EnableHelloWorld
public class HelloWorldBootStrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(HelloWorldBootStrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        String helloWorld = context.getBean("helloWorld", String.class);
        System.out.println(helloWorld);


        context.close();
    }

}
