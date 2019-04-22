package com.zhangjianbing.autoconfig.bootstrap;

import com.zhangjianbing.autoconfig.config.WebConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author Ryan Zhang
 * @Title: BootStrap01
 * @Description:
 * @date 2019/4/21
 * @From https://www.zhangjianbing.com
 */
public class BootStrap01 {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(WebConfiguration.class)
                .run(args);
//        User user = context.getBean("user", User.class);
//        System.out.println(user.toString());

        // 关闭上下文
        // context.close();
    }

}
