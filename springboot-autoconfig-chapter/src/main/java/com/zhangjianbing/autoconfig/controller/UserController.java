package com.zhangjianbing.autoconfig.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ryan Zhang
 * @Title: UserController
 * @Description: 用户控制类
 * @date 2019/4/21
 * @From https://www.zhangjianbing.com
 */
@RestController
public class UserController {

    @RequestMapping("/hello")
    public String getMsg() {
        return "Hello World!";
    }

}
