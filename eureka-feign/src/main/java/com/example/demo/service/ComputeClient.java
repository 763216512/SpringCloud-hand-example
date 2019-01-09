package com.example.demo.service;

import com.example.demo.service.serviceimpl.ComputeClientHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author gaokun.huang@hand-china.com
 * @version 1.0
 * @name
 * @description
 * @date 2019/1/8
 */
@FeignClient(value = "compute-service", fallback = ComputeClientHystrix.class)
//@FeignClient("compute-service")
public interface ComputeClient {
    @RequestMapping(method = RequestMethod.GET, value = "/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}

