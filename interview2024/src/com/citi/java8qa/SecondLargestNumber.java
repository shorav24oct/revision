package com.citi.java8qa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 4, 5, 6, 6, 7, 2);

        Integer i = numbers.stream()
                .distinct() // Remove duplicates
                .sorted(Comparator.reverseOrder()) // Sort the stream in descending order
                .skip(1) // Skip the largest number
                .findFirst() // Find the second-largest number
                .get();

        System.out.println(i);

    }
}
