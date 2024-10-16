package com.company.lec9;

import java.util.Iterator;
import java.util.LinkedList;

public class PracticeQ16 {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("Pink");
        list.add("orange");

        System.out.println("The Original linked list: " + list);
        Iterator I = list.listIterator(3);
        while(I.hasNext()){
            System.out.println(I.next());
        }
    }
}
