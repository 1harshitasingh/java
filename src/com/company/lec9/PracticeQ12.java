package com.company.lec9;

import java.util.ArrayList;
import java.util.List;

public class PracticeQ12 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Black");
        list.add("Pink");
        list.add("Blue");
        System.out.println("Original linked list:" + list);
        for(int p=0; p < list.size(); p++)
        {
            System.out.println("Element at index "+p+": "+list.get(p));
        }
    }
}


