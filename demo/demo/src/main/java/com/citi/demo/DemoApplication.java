package com.citi.demo;

import com.citi.demo.Utility.MyDate;
import com.citi.demo.entity.Student;
import com.citi.demo.service.DemoService;
import com.citi.demo.service.PaytmService;
import com.citi.demo.service.PhonepayService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        PhonepayService phonepayService = context.getBean("phonepayService", PhonepayService.class);
        PaytmService paytmService = context.getBean("paytmService", PaytmService.class);
        System.out.println(paytmService.hashCode() + " " + phonepayService.hashCode() );
        DemoService demoService = context.getBean("demoService", DemoService.class);
        demoService.printMsg();

    }

}
