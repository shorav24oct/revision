package com.citi.demo.service;

import com.citi.demo.controller.DemoController;
import com.citi.demo.repositroy.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @Autowired
    private Payment payment;

    public void printMsg() {
        payment.pay();
    }

}
