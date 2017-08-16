package com.stonecj.webtest.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by aaa on 2017/8/16.
 */
@Component
@ConfigurationProperties(prefix = "application")
public class ApplicationProperties {

//    @Value("${application.paycenter}")
    private String paycenter;
    private String cashier;

    public String getPaycenter() {
        return paycenter;
    }

    public void setPaycenter(String paycenter) {
        this.paycenter = paycenter;
    }

    public String getCashier() {
        return cashier;
    }

    public void setCashier(String cashier) {
        this.cashier = cashier;
    }
}
