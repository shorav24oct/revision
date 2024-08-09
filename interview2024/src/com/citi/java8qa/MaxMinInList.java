package com.citi.java8qa;

import java.util.Comparator;
import java.util.stream.Stream;

public class MaxMinInList {
    public static void main(String[] args) {

        Integer max = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .max(Comparator.comparing(Integer::valueOf))
                .get();
        System.out.println("MAX: " + max);

        Integer min = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .min(Comparator.comparing(Integer::valueOf))
                .get();
        System.out.println("MIN: " + min);

    }
}
