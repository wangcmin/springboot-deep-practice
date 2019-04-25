package com.zhangjianbing.autoconfig.annotation;

import com.zhangjianbing.autoconfig.conditionconfig.OnSystemCondition;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
@Conditional(OnSystemCondition.class)
public @interface ConditionalOnSystem {

    String name() default "";

    String value() default "";

}
