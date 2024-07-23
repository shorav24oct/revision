package com.citi.demo.service;

import com.citi.demo.controller.DemoController;
import com.citi.demo.repositroy.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    private DemoController controller;

    @Autowired
    @Lazy
    public void setController(DemoController controller) {
        this.controller = controller;
    }
}
