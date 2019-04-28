package com.zhangjianbing.autoconfig.conditionconfig.importselectorconfig;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 向容器中注入Bean的实现类 {@link ImportSelector}
 *
 * @author 张建兵 Ryan
 * time 2019/4/28
 */
public class HelloWorldImportSelector implements ImportSelector {

    /**
     * @param annotationMetadata 获取注解的元信息(包括自定义注解)
     * @return 返回类的全类名数组形式，将会注入到IOC容器中
     */
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        List<String> list = null;
        // 向容器中注入两个类
        list = new ArrayList<>();
        list.add("com.zhangjianbing.autoconfig.entity.Fish");
        list.add("com.zhangjianbing.autoconfig.entity.Pig");
        return StringUtils.toStringArray(list);
    }

}
