package com.zhangjianbing.autoconfig.bootstrap;

import com.zhangjianbing.autoconfig.entity.Fish;
import com.zhangjianbing.autoconfig.entity.Pig;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 张建兵 Ryan
 * time 2019/4/28
 */
@ComponentScan("com.zhangjianbing.autoconfig.conditionconfig.importselectorconfig")
public class ImportSelectorBootStrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ImportSelectorBootStrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        Pig pig = context.getBean(Pig.class);
        Fish fish = context.getBean(Fish.class);
        System.out.println(pig);
        System.out.println(fish);

        context.close();
    }

}
