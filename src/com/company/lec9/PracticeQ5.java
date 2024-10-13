package com.company.lec9;

import java.util.ArrayList;
import java.util.Collections;

public class PracticeQ5 {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);


        list.set(0, 0);
        System.out.println(list);


        //delete elements
        list.remove(0);
        System.out.println(list);


        //size of list
        int size = list.size();
        System.out.println(size);


        //Sorting the list
        list.add(0);
        Collections.sort(list);
        System.out.println(list);
    }
}


