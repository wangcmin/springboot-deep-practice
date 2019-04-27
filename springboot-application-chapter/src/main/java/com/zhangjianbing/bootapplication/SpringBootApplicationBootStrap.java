package com.zhangjianbing.bootapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author Ryan Zhang
 * @Title: {@link SpringBootApplication} 引导类
 * @Description:
 * @date 2019/4/27
 * @From https://www.zhangjianbing.com
 */

public class SpringBootApplicationBootStrap {

    public static void main(String[] args) {
//        ConfigurableApplicationContext context = new SpringApplicationBuilder(SpringBootApplicationBootStrap.class)
//                .web(WebApplicationType.NONE)
//                .sources()
//                .run(args);
//
//
//
//        context.close();

        SpringApplication.run(SpringBootApplicationBootStrap.class);
    }

//    @SpringBootApplication
//    public static class SpringBootApplication02 {
//
//    }

}
