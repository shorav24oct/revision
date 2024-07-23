package com.citi.core.collection;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayList extends ArrayList {

    @Override
    public boolean add(Object o) {
        if (this.contains(o)) {
            return true;
        } else {
            return super.add(o);
        }
    }

    public static void main(String[] args) {
        List list = new CustomArrayList();

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);

        System.out.println(list);
    }
}
