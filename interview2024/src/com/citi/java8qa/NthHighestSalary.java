package com.citi.java8qa;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NthHighestSalary {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("alex", 3000);   // highest
        map.put("blake", 1500);
        map.put("matt", 1400);
        map.put("sam", 1200);
        map.put("wilson", 1700); // 2nd highest

        Map.Entry<String, Integer> entry = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList())
                .get(3);

        System.out.println(getNthHighestSalary(2, map));

        Map<String, Integer> map1 = new HashMap<>();

        map1.put("alex", 3000);   // highest
        map1.put("blake", 3000);
        map1.put("matt", 1400);
        map1.put("sam", 1700);
        map1.put("wilson", 1700); // 2nd highest

        System.out.println(getNthHighSal(2,map1));
        

    }

    private static Map.Entry<Integer, List<String>> getNthHighSal(int no, Map<String, Integer> map1) {
        return map1
                .entrySet()
                .stream()
                .collect(
                        Collectors.groupingBy(Map.Entry::getValue,
                                Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toList())
                .get(no - 1);
    }

    private static Map.Entry<String, Integer> getNthHighestSalary(int no, Map<String, Integer> map) {
        return map.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList())
                .get(no - 1);
    }
}
