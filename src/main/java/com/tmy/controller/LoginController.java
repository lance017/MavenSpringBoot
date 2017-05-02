package com.tmy.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lance017 on 2017/5/2.
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    @RequestMapping("/user/{user}")
    public String hello(@PathVariable("user") String user) {
        return "qq" + user;
    }

    @RequestMapping
    public String hello() {
        return "123456";
    }
}
