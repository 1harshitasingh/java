package com.company.lec9;

import java.util.ArrayList;
import java.util.List;

public class PracticeQ11 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Black");
        list.add("Pink");
        list.add("Blue");

        if (list.contains("Red")) {
            System.out.println("Found the element");
        } else {
            System.out.println("There is no such element");
        }
    }
    }