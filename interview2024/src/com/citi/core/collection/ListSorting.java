package com.citi.core.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListSorting {
    public static void main(String[] args) {
        List<Integer> listIntegers = new ArrayList<>();

        listIntegers.add(10);
        listIntegers.add(20);
        listIntegers.add(5);
        listIntegers.add(40);
        listIntegers.add(55);

        listIntegers.stream()
                .sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("--------------------");

        listIntegers.stream()
                .sorted((i1,i2) -> -i1.compareTo(i2))
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
