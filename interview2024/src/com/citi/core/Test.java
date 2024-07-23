package com.citi.core;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(12334,32223,13444,67779,16777 );

        List<String> collect = integers.stream()
                .map(i -> i + "")
                .filter(i -> i.startsWith("1"))
                .map(i -> i.substring(1))
                .collect(Collectors.toList());

        //collect.stream().forEach(System.out::println);

        integers.stream().map(Object::toString).filter(i -> i.startsWith("1"))
                .map(i -> i.substring(1))
                .forEach(System.out::println);

    }
}
