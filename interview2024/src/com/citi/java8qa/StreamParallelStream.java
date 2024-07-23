package com.citi.java8qa;

import java.util.stream.IntStream;

public class StreamParallelStream {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,3).forEach(t -> System.out.println(Thread.currentThread().getName() + " " + t));
        System.out.println("----------------------------");
        IntStream.rangeClosed(1,3).parallel().forEach(t -> System.out.println(Thread.currentThread().getName() + " " + t));
    }
}
