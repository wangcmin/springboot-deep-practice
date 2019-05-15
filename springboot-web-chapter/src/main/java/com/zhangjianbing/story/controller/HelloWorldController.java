package com.zhangjianbing.story.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangjianbing
 * time 2019/5/15
 */
@RestController
@RequestMapping("/zhangjianbing")
public class HelloWorldController {

    @RequestMapping("/hello_world")
    public String getMessage() {
        return "hello world";
    }

}
