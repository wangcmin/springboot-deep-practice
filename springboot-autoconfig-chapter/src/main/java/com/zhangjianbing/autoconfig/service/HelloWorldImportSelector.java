package com.zhangjianbing.autoconfig.service;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author Ryan Zhang
 * @Title: HelloWorldImportSelector
 * @Description:
 * @date 2019/4/22
 * @From https://www.zhangjianbing.com
 */
public class HelloWorldImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.zhangjianbing.autoconfig.config.HelloWorldConfiguration"};
    }
}
