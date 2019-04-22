package com.zhangjianbing.autoconfig;

import com.zhangjianbing.autoconfig.config.WebConfiguration;
import com.zhangjianbing.autoconfig.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author 张建兵 Ryan
 * time 2019/4/15
 */
@SpringBootApplication
public class AutoConfigApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(AutoConfigApplication.class)
                .run(args);
        User user = context.getBean("user", User.class);
        System.out.println(user.toString());

        // 关闭上下文
        context.close();
    }

}
