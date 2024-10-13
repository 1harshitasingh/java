package com.company.lec9;

import java.util.ArrayList;


public class PracticeQ4 {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();


        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);


        int element = list.get(0); // 0 is the index
        System.out.println(element);


        list.add(1, 2);
        System.out.println(list);


    }
}
