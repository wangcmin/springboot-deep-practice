package com.zhangjianbing.story;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

/**
 * @author Ryan Zhang
 * @Title: SpringbootWebApplication
 * @Description: SpringBoot引导类
 * @date 2019/4/14
 * @From https://www.zhangjianbing.com
 */
@SpringBootApplication
// 开启servlet扫描（注册servlet）
@ServletComponentScan(basePackages = "com.zhangjianbing.story.web.servlet")
public class SpringbootWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebApplication.class, args);
    }

    /**
     * Description: 增加 webflux 函数式 Endpoint代码
     * @author: Ryan Zhang
     * Date: 2019/5/7
     * From: https://www.zhangjianbing.com
     */
    @Bean
    public RouterFunction<ServerResponse> helloWorld() {
        return route(GET("/hello-world"),
                request -> ok().body(Mono.just("hello,world"), String.class)

        );
    }

}
