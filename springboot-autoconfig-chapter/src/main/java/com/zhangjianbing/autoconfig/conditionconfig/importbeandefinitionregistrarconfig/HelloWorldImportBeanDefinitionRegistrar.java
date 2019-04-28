package com.zhangjianbing.autoconfig.conditionconfig.importbeandefinitionregistrarconfig;

import com.zhangjianbing.autoconfig.entity.Fish;
import com.zhangjianbing.autoconfig.entity.Pig;
import com.zhangjianbing.autoconfig.entity.User;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * {@link ImportBeanDefinitionRegistrar} 实现类
 *
 * @author Ryan
 * time 2019/4/28
 */
public class HelloWorldImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        boolean a = beanDefinitionRegistry.containsBeanDefinition(Pig.class.getName());
        boolean b = beanDefinitionRegistry.containsBeanDefinition(Fish.class.getName());
        if (a && b) {
            // 如果容器中存在 pig 和 fish 的定义信息，就向容器中注入 User 的定义信息
            RootBeanDefinition beanDefinition = new RootBeanDefinition(User.class);
            beanDefinitionRegistry.registerBeanDefinition("user", beanDefinition);
        }
    }

}
