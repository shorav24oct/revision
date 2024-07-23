package com.citi.logical.strings;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFrequencyJava8 {
    public static void main(String[] args) {
        String str = "geeks";
        countFreq(str, str.length());

        Map<String, Long> collect = Arrays.
                stream(str.split("")).
                collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                );

        System.out.println(collect);

    }

    static void countFreq(String str, int n) {
        int[] count = new int[256];

        for (int i = 0; i < n; i++) {
            count[str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 256; i++) {
            if (count[i] > 0) {
                System.out.println( (char) (i + 'a') + " " + count[i] );
            }
        }

    }
}
