package com.citi.java8qa;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFrequency {
    public static void main(String[] args) {
        String str = "geeks";

        Map<String, Long> collect = Arrays.stream(str.split(""))
                        .collect(
                                Collectors.groupingBy(
                                        Function.identity(), Collectors.counting()
                                )
                        );

        System.out.println(collect);
    }
}
