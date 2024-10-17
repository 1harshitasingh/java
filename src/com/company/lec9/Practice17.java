package com.company.lec9;

import java.util.Iterator;
import java.util.LinkedList;

public class Practice17 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("Pink");
        list.add("orange");

        System.out.println("The Original linked list: " + list);
        Iterator t = list.descendingIterator();

        System.out.println("Elements in Reverse Order:");
        while (t.hasNext()) {
            System.out.println(t.next());
        }
    }
}
