package com.zhangjianbing.autoconfig.conditionconfig.importbeandefinitionregistrarconfig;

import com.zhangjianbing.autoconfig.annotation.IWantYou;
import com.zhangjianbing.autoconfig.entity.Fish;
import com.zhangjianbing.autoconfig.entity.Pig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Ryan
 * time 2019/4/28
 */
@Configuration
@Import({Pig.class, Fish.class, HelloWorldImportBeanDefinitionRegistrar.class})
public class ImportBeanDefinitionRegistrarConfig {

//    @Bean
//    public Pig pig() {
//        return new Pig();
//    }
//
//    @Bean
//    @IWantYou
//    public Fish fish() {
//        return new Fish();
//    }


}
