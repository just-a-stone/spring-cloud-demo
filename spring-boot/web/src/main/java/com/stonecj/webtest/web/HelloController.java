package com.stonecj.webtest.web;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by aaa on 2017/8/16.
 */
@RestController
@RequestMapping("hello")
public class HelloController implements InitializingBean{

    RestTemplate restTemplate;



    @GetMapping("say")
    public String say(){
        return "hello world";
    }

    @GetMapping("baidu")
    public String baidu(){
        return restTemplate.getForEntity("http://www.baidu.com", String.class).getBody();
    }

    @GetMapping("cashier")
    public String cashier(){
        return restTemplate.getForObject("http://qa-test.oriental-finance.cn/cashier/testpage/pay/cashierPay1.jsp",String.class);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        restTemplate = new RestTemplateBuilder()
                .setConnectTimeout(1000)
                .setReadTimeout(1000)
                .build();
    }
}
