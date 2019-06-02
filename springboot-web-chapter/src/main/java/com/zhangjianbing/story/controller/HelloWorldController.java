package com.zhangjianbing.story.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangjianbing
 * time 2019/5/15
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/zhangjianbing")
    public String getMessage() {
        return "Hello Ryan ~";
    }

}
