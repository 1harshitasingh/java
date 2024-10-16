package com.company.lec9;

import java.util.LinkedList;

public class PracticeQ14 {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("Pink");
        list.add("orange");

        System.out.println("The Original linked list: " + list);

        list.clear();

        System.out.println("The New linked list: " + list);
    }
}



