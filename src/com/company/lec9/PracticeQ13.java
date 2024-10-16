package com.company.lec9;

import java.util.LinkedList;

public class PracticeQ13 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Black");
        list.add("Pink");
        list.add("Blue");
        System.out.println("The Original linked list: " + list);

        String firstElement = list.removeFirst();
        System.out.println("Element removed: " + firstElement);

        String lastElement = list.removeLast();
        System.out.println("Element removed: " + lastElement);
        System.out.println("The New linked list: " + list);
    }
}
