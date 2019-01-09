package com.example.demo.service.serviceimpl;

import com.example.demo.service.ComputeClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author gaokun.huang@hand-china.com
 * @version 1.0
 * @name
 * @description
 * @date 2019/1/8
 */

@Component
public class ComputeClientHystrix implements ComputeClient {
    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -9999;
    }
}
