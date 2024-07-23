package com.citi.demo.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope(scopeName = "prototype")
public class Hobby {
    private static List<String> hobbies;

    public Hobby() {
    }

    public static List<String> getHobbies() {
        return hobbies;
    }

    public static void setHobbies(List<String> hobbies) {
        Hobby.hobbies = hobbies;
    }
}
