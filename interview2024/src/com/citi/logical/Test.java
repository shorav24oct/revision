package com.citi.logical;

import java.util.Comparator;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        String s = Stream.of("abc", "abcd", "abcde")
                .max(Comparator.comparing(String::length))
                .get();
        //System.out.println(s);

        /*

         */
        String str = "geeksforgeeks"; // n
        int[] count = new int[256];

        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i)]++;

        for (int i = 0; i < str.length(); i++){
            if (count[str.charAt(i)] == 1) {
                System.out.println(str.charAt(i) + " on index " + i);
                break;
            }
        }

    }
}
