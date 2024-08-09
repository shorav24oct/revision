package com.citi.java8qa;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFreqOnNumberInList {
    public static void main(String[] args) {
        int arr[] = new int[]{2, 2, 3, 3, 5, 6, 7, 9, 9, 0};

        List<Integer> integerList = Arrays.asList(10, 20, 30, 15, 25, 5);

        Map<Integer, Long> collect1 = integerList.stream()
                .collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                );

        Map<Integer, Long> collect = Arrays.stream(arr)
                .boxed()
                .collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        ));

        System.out.println(collect);
    }
}
