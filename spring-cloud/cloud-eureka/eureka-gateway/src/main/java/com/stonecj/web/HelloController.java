package com.stonecj.web;

import com.stonecj.remote.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by aaa on 2017/8/17.
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("hello")
    public String hello(){
        return helloService.hello("bob");
    }
}
