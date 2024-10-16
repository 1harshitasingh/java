package com.company.lec9;

import java.util.ArrayList;
import java.util.List;

public class PracticeQ9 {
    public static void main(String[] args) {

        List<String> list= new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Black");
        list.add("Pink");
        list.add("Blue");

        System.out.println(list);

        System.out.println("First element:" +list.get(0));

        System.out.println("Third element: "+list.get(3));
    }
}

