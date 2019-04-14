package com.zhangjianbing.story;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author Ryan Zhang
 * @Title: SpringbootWebApplication
 * @Description: SpringBoot引导类
 * @date 2019/4/14
 * @From https://www.zhangjianbing.com
 */
@SpringBootApplication
// 开启servlet扫描（注册servlet）
@ServletComponentScan(basePackages = "com.zhangjianbing.story.web.servlet")
public class SpringbootWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebApplication.class, args);
    }

}
