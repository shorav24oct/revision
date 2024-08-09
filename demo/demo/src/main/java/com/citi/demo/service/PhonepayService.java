package com.citi.demo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PhonepayService implements Payment{
    @Override
    public void pay() {
        System.out.println("PhonepayService.pay");
    }
}
