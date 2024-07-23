package com.citi.core.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new ConcurrentHashMap<>();

        map.put(1,"one");
        map.put(2,"two");

        Iterator iterator = map.keySet().iterator();

        while (iterator.hasNext()) {
            Integer key = (Integer) iterator.next();
            System.out.println(key + " : " + map.get(key));
            map.put(3,"three");
        }

    }
}
