package com.citi.java8qa;

import java.util.Comparator;
import java.util.stream.Stream;

public class LargestString {
    public static void main(String[] args) {

        String largest = Stream.of("apple", "banana", "orange", "watermelon")
                .max(Comparator.comparingInt(String::length))
                .get();
        System.out.println("Largest string: " + largest);
    }
}
