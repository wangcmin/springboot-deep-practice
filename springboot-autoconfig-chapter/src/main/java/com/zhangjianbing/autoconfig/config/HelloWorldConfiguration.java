package com.zhangjianbing.autoconfig.config;

import org.springframework.context.annotation.Bean;

/**
 * @author Ryan Zhang
 * @Title: HelloWorldConfiguration
 * @Description:
 * @date 2019/4/22
 * @From https://www.zhangjianbing.com
 */
public class HelloWorldConfiguration {

    @Bean
    public String helloWorld() {
        return "hello Ryan";
    }

}
