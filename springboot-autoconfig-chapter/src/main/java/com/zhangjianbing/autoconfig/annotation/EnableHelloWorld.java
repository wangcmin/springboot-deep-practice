package com.zhangjianbing.autoconfig.annotation;

import com.zhangjianbing.autoconfig.service.HelloWorldImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(HelloWorldImportSelector.class)
public @interface EnableHelloWorld {

}
