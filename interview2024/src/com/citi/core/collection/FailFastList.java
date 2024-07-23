package com.citi.core.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastList {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>();

        list.add(1);
        list.add(2);

        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            Integer i = (Integer) iterator.next();
            System.out.println(i);
            list.add(i);
        }
    }
}
