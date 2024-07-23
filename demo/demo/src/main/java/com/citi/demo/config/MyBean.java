package com.citi.demo.config;

import com.citi.demo.Utility.MyDate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBean {

    @Bean
    public MyDate myDate() {
        return new MyDate();
    }

}
