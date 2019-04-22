package com.zhangjianbing.autoconfig.configauto;

import com.zhangjianbing.autoconfig.config.WebConfiguration;
import com.zhangjianbing.autoconfig.entity.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Ryan Zhang
 * @Title: WebAutoConfiguration
 * @Description:
 * @date 2019/4/21
 * @From https://www.zhangjianbing.com
 */
@Configuration
@Import(value = {User.class})
public class WebAutoConfiguration {

}
