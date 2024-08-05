package com.citi.java8qa;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlattenArray {
    public static void main(String[] args) {
        Object[] arr = {1, 2, new Object[]{4, new Integer[]{5, 6}, 7}, 10};

        flatten2(arr).map(Object::toString).forEach(System.out::println);

    }

    private static Stream<Object> flatten2(Object[] array) {
        return Arrays.stream(array)
                .flatMap(o -> o instanceof Object[] ? flatten2( (Object[]) o) : Stream.of(o));
    }

}
