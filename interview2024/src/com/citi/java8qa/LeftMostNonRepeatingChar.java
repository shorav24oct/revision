package com.citi.java8qa;

/*
Input: geeksforgeeks
Output: f

Input: abcdabcde
Output: e

Input: aabb
Output: -1
 */

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LeftMostNonRepeatingChar {
    public static void main(String[] args) {

        Map<Character, Long> collect = "geeksforgeeks".chars()
                .mapToObj(i -> (char) i)
                .collect(
                        Collectors.groupingBy(
                                Function.identity(), LinkedHashMap::new, Collectors.counting()
                        ));

        Optional<Character> firstNonRepeat = collect.entrySet().stream()
                .filter((e) -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

        System.out.println("First Non repeating: " + firstNonRepeat.orElse(null));
    }
}
