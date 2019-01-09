package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;


import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gaokun.huang@hand-china.com
 * @version 1.0
 * @name
 * @description
 * @date 2019/1/9
 */

@RefreshScope
@RestController
class TestController {
    @Value("${from}")
    private String from;
    @RequestMapping("/from")
    public String from() {
        return this.from;
    }
}

