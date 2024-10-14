package com.company.lec9;

import java.util.ArrayList;
import java.util.List;

public class PracticeQ10 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Black");
        list.add("Pink");
        list.add("Blue");

        System.out.println(list);
        list.set(2, "Yellow");

        System.out.println(list);
    }
}
