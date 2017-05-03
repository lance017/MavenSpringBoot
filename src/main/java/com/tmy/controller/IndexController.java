package com.tmy.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lance017 on 2017/5/2.
 */
@RestController
public class IndexController {

    @RequestMapping("/")
    public Person test() {
        return new Person("lance", 23);
    }
}
