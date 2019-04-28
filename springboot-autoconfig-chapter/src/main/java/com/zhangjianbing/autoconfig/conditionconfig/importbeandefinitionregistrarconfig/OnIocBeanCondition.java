package com.zhangjianbing.autoconfig.conditionconfig.importbeandefinitionregistrarconfig;

import com.zhangjianbing.autoconfig.annotation.IWantYou;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * {@link Condition} 条件装配Bean实现类
 *
 * @author 张建兵 Ryan
 * time 2019/4/28
 */
public class OnIocBeanCondition implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Map<String, Object> attributes = annotatedTypeMetadata.getAnnotationAttributes(IWantYou.class.getName());
        String value = String.valueOf(attributes.get("value"));
        return "yes".equals(value);
    }

}
