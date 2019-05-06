package com.zhangjianbing.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Ryan
 * time 2019/5/6
 */
@Controller
public class HelloWorldController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

}
