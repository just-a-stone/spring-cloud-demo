package com.stonecj.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by aaa on 2017/8/17.
 */
@FeignClient("hello-app")
public interface HelloService {

    @RequestMapping("hello")
    public String hello(@RequestParam(name = "name") String name);
}
