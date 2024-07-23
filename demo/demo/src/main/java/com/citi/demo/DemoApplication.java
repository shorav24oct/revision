package com.citi.demo;

import com.citi.demo.Utility.MyDate;
import com.citi.demo.entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        Student s1 = context.getBean("student", Student.class);
        Student s2 = context.getBean("student", Student.class);

        System.out.println(s1.getHobby().hashCode() + " - " + s2.getHobby().hashCode());
    }

}
