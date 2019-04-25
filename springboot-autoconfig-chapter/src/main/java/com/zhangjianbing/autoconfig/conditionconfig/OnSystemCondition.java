package com.zhangjianbing.autoconfig.conditionconfig;

import com.zhangjianbing.autoconfig.annotation.ConditionalOnSystem;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * 装载Bean条件判断实现类 {@link Condition}
 *
 * @author 张建兵 Ryan
 * time 2019/4/25
 */
public class OnSystemCondition implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata metadata) {
        Map<String, Object> attributes = metadata.getAnnotationAttributes(ConditionalOnSystem.class.getName());
        String name = String.valueOf(attributes.get("name"));
        String value = String.valueOf(attributes.get("value"));
        String systemname = System.getProperties().getProperty(name);
        return systemname.equals(value);
    }

}
