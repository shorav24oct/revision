package com.citi.logical.array;

import java.util.Arrays;
import java.util.stream.Stream;

public class Flatten {
    public static void main(String[] args) {
        Object[] arr = {1, 2, new Object[]{4, new Integer[]{5, 6}, 7}, 10};

        //flatten1(arr).map(Object::toString).forEach(System.out::println);
        System.out.println("------------------------------------------");
        flatten2(arr).map(Object::toString).forEach(System.out::println);

    }

    /*private static Stream<Object> flatten1(Object[] array) {
        return Arrays.stream(array)
                .flatMap(o -> o instanceof Object[] a ? flatten1(a) : Stream.of(o));
    }*/

    private static Stream<Object> flatten2(Object[] array) {
        return Arrays.stream(array)
                .flatMap(o -> o instanceof Object[] ? flatten2((Object[]) o) : Stream.of(o));
    }


}
