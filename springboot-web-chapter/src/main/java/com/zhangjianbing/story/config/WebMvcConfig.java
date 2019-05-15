package com.zhangjianbing.story.config;

import com.zhangjianbing.story.interceptor.BaseInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.annotation.Resource;

/**
 * @author zhangjianbing
 * time 2019/5/15
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Resource
    private BaseInterceptor baseInterceptor;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // addPathPatterns 添加路径
        // excludePathPatterns 排除路径
        registry.addInterceptor(baseInterceptor).addPathPatterns("/**");
//        super.addInterceptors(registry);
    }

}
