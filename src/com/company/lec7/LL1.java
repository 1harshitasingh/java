package com.company.lec7;

import java.util.LinkedList;
    public class LL1 {
        public static void main(String[] args) {

            LinkedList<Integer> l1 = new LinkedList<>();

            l1.add(11);
            l1.add(22);
            l1.add(33);
            l1.add(44);
            l1.add(55);
            l1.add(77);
            l1.add(5,77);
            System.out.println("L1 Linked list before: "+ l1);

            l1.remove(2);
            System.out.println("L1 Linked list after: "  + l1);

        }
    }


