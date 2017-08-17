package com.stonecj.eurekaApp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by aaa on 2017/8/17.
 */
@RestController
public class HelloController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public List<String> index(@RequestParam(name = "name",required = true) String name) {
        return discoveryClient.getServices();
    }
}
