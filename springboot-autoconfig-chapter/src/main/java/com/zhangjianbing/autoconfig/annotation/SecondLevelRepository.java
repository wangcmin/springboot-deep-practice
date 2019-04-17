package com.zhangjianbing.autoconfig.annotation;

import org.springframework.stereotype.Repository;

import java.lang.annotation.*;

/**
 * Description: 自定义二级注解 {@link Repository @Repository}
 * Repository的派生性
 *
 * @param:
 * @author: Ryan Zhang
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@FirstLevelRepository
public @interface SecondLevelRepository {

    String value() default "";

}
