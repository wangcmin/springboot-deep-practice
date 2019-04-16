package com.zhangjianbing.autoconfig.bootstrap;

import com.zhangjianbing.autoconfig.repository.MyFirstRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Ryan Zhang
 * @Title: RepositoryBootStrap
 * @Description: Repository引导类
 * @date 2019/4/16
 * @From https://www.zhangjianbing.com
 */
@ComponentScan("com.zhangjianbing.autoconfig.repository")
public class RepositoryBootStrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(RepositoryBootStrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        MyFirstRepository myFirstRepository = context.getBean("myFirstRepository", MyFirstRepository.class);
        System.out.println("=================> " + myFirstRepository);

        // 关闭对象
        context.close();
    }

}
