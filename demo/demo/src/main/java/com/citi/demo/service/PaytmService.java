package com.citi.demo.service;

import org.springframework.stereotype.Service;

@Service
public class PaytmService implements Payment{
    @Override
    public void pay() {
        System.out.println("PaytmService.pay");
    }
}
