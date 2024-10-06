package com.company.lec7;

import java.util.*;

    public class Deque {
        public static void main(String[] args) {

            ArrayDeque<Integer> ad1 = new ArrayDeque<>();
            ad1.add(6);
            ad1.add(56);
            ad1.add(9);
            ad1.addFirst(5);
            ad1.offerFirst(10);
            System.out.println(ad1);

        }
    }


