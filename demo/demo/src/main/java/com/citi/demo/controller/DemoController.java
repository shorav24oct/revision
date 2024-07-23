package com.citi.demo.controller;

import com.citi.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/demo")
public class DemoController {

    private DemoService service;

    @Autowired
    @Lazy
    public void setService(DemoService service) {
        this.service = service;
    }

    @GetMapping("/msg")
    private String grettingMsg() {
        return "good night";
    }

}
