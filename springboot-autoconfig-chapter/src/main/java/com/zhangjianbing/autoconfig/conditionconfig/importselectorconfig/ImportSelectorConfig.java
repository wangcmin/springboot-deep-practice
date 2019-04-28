package com.zhangjianbing.autoconfig.conditionconfig.importselectorconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author 张建兵 Ryan
 * time 2019/4/28
 */
@Configuration
@Import({HelloWorldImportSelector.class,})
public class ImportSelectorConfig {


}
