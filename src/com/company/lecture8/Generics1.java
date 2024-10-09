package com.company.lecture8;

import java.util.ArrayList;

public class Generics1 {


        public static void main(String[] args) {

            ArrayList<Integer> myArrayList = new ArrayList();
            myArrayList.add(10);
            myArrayList.add(20);
            myArrayList.add(30);
            myArrayList.add(40);

            int x = myArrayList.get(0);
            System.out.println(x);

        }
}



