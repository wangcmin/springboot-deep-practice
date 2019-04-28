package com.zhangjianbing.autoconfig.annotation;

import com.zhangjianbing.autoconfig.conditionconfig.importbeandefinitionregistrarconfig.OnIocBeanCondition;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * 用来指定需要注入容器中的Bean
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
@Conditional(OnIocBeanCondition.class)
public @interface IWantYou {

    String value() default "yes";

}
