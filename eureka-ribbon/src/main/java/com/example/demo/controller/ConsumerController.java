package com.example.demo.controller;

import com.example.demo.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author gaokun.huang@hand-china.com
 * @version 1.0
 * @name
 * @description
 * @date 2019/1/8
 */

//@RestController
//public class ConsumerController {
//    @Autowired
//    RestTemplate restTemplate;
//    @RequestMapping(value = "/add", method = RequestMethod.GET)
//    public String add() {
//        return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=10&b=20", String.class).getBody();
//    }
//}

@RestController
public class ConsumerController {
    @Autowired
    private ComputeService computeService;
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return computeService.addService();
    }
}

