package com.stonecj.webtest.web;

import com.stonecj.webtest.config.ApplicationProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by aaa on 2017/8/16.
 */
@RestController
@RequestMapping("yaml")
public class YamlPropertyController {

    @Autowired
    private ApplicationProperties applicationProperties;

    @GetMapping("application")
    public ApplicationProperties application(){
        return applicationProperties;
    }
}
