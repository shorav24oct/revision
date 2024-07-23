package com.citi.core.exception;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ExceptionHandling {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("123","456","abc");

        //list.forEach(ExceptionHandling::printList);

        list.forEach(handleException(s -> System.out.println(Integer.parseInt(s))));
    }

    private static void printList(String s) {
        try {
            System.out.println(Integer.parseInt(s));
        } catch (Exception e) {
            System.out.println("exception : " + e.getMessage());
        }
    }

    private static Consumer<String> handleException(Consumer<String> payLoad) {
        return obj -> {
            try {
                payLoad.accept(obj);
            } catch (Exception e) {
                System.out.println("exception : " + e.getMessage());
            }
        };
    }
}
