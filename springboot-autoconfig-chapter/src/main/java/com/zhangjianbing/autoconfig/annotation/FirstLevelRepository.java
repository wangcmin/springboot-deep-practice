package com.zhangjianbing.autoconfig.annotation;

import org.springframework.stereotype.Repository;

import java.lang.annotation.*;

/**
 * Description: 自定义一级注解 {@link Repository @Repository}
 *
 * @param:
 * @author: Ryan Zhang
 * Date: 2019/4/16
 * From: https://www.zhangjianbing.com
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repository
public @interface FirstLevelRepository {

    String value() default "";

}
