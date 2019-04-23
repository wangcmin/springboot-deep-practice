package com.zhangjianbing.autoconfig.bootstrap;

import com.zhangjianbing.autoconfig.conditionconfig.profileconfig.ICalculatorService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 张建兵 Ryan
 * time 2019/4/23
 */
@ComponentScan("com.zhangjianbing.autoconfig.conditionconfig.profileconfig")
public class ProfileBootStrap {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new SpringApplicationBuilder(ProfileBootStrap.class)
                .web(WebApplicationType.NONE)
                .profiles("java7")
                .run(args);

//        Java7ForImpl java7ForImpl = context.getBean("java7ForImpl", Java7ForImpl.class);
//        Integer sum = java7ForImpl.sum(1, 2, 3);
//        System.out.println(sum);
//        System.out.println(java7ForImpl);

        ICalculatorService calculator = context.getBean(ICalculatorService.class);
        Integer sum = calculator.sum(1, 2, 3);
        System.out.println(sum);

        context.close();
    }

}
