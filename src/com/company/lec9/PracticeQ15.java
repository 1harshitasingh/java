package com.company.lec9;

import java.util.Collections;
import java.util.LinkedList;

public class PracticeQ15 {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("Pink");
        list.add("orange");

        System.out.println("The Original linked list: " + list);
        Collections.swap(list, 0, 2);
        System.out.println("The New linked list after swap: " +list);
    }
}
