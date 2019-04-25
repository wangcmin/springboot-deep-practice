package com.zhangjianbing.autoconfig.bootstrap;

import com.zhangjianbing.autoconfig.annotation.ConditionalOnSystem;
import com.zhangjianbing.autoconfig.entity.User;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @author 张建兵 Ryan
 * time 2019/4/23
 */

public class ConditionBootStrap {

    @Bean
    @ConditionalOnSystem(name = "user.name",value = "Ryan_Zhang")
    public User user() {
        return new User();
    }

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new SpringApplicationBuilder(ConditionBootStrap.class)
                .web(WebApplicationType.NONE)
                .run(args);


        User user = context.getBean("user", User.class);
        System.out.println(user.toString());


        context.close();
    }

}
