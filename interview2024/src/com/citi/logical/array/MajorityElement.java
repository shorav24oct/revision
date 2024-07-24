package com.citi.logical.array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {

        int[] array = {1, 1, 1, 1, 2, 2, 2};

        Map<Integer, Integer> map = new HashMap<>();

        for (int j : array) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }
        System.out.println(map);
    }
}
