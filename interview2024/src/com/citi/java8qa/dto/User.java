package com.citi.java8qa.dto;

import java.util.List;

public class User {
    String name;
    List<String> mailId;

    public User(String name, List<String> mailId) {
        this.name = name;
        this.mailId = mailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMailId() {
        return mailId;
    }

    public void setMailId(List<String> mailId) {
        this.mailId = mailId;
    }
}
