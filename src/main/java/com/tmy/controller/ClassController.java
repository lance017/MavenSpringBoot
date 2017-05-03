package com.tmy.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lance017 on 2017/5/2.
 */
@RestController
@RequestMapping("/class")
public class ClassController {

    @RequestMapping
    public String test() {
        return "test";
    }

    @RequestMapping("/hello")
    public String hello(@RequestBody User user) {
        return "hello";
    }

}
