package com.tmy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Created by lance017 on 2017/5/2.
 */
@SpringBootApplication

public class Application {
    // 主方法，从这里调起 web
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
