package com.citi.demo.entity;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class Student {

    private String name;
    private String rollNo;

    @Autowired
    private Hobby hobby;

    @Autowired
    private ObjectFactory<Hobby> hobbyObjectFactory;

    @Autowired
    ApplicationContext applicationContext;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public Hobby getHobby() {
        // return applicationContext.getBean(Hobby.class);
        // return hobbyObjectFactory.getObject();
        return getInstance();
    }

    @Lookup
    public Hobby getInstance() {
        return null;
    }

    public void setHobby(Hobby hobby) {
        this.hobby = hobby;
    }
}
