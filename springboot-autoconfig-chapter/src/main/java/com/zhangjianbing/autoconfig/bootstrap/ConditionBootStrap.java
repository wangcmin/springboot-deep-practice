package com.zhangjianbing.autoconfig.bootstrap;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 张建兵 Ryan
 * time 2019/4/23
 */
@ComponentScan("")
public class ConditionBootStrap {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new SpringApplicationBuilder(ConditionBootStrap.class)
                .web(WebApplicationType.NONE)
                .run(args);


        context.close();
    }

}
