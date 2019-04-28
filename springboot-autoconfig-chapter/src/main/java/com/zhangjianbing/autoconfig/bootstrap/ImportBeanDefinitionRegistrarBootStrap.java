package com.zhangjianbing.autoconfig.bootstrap;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

/**
 * @author 张建兵 Ryan
 * time 2019/4/28
 */
@ComponentScan("com.zhangjianbing.autoconfig.conditionconfig.importbeandefinitionregistrarconfig")
public class ImportBeanDefinitionRegistrarBootStrap {


    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ImportBeanDefinitionRegistrarBootStrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        // 获取Bean的定义信息
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String str : beanDefinitionNames) {
            System.out.println("====== " + str);
        }


        context.close();
    }

}
