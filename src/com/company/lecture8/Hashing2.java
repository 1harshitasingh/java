package com.company.lecture8;

import java.util.*;

public class Hashing2 {
    public static void main(String[] args) {


            HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
            myHashSet.add(6);
            myHashSet.add(8);
            myHashSet.add(3);
            myHashSet.add(11);
            myHashSet.add(11);

            System.out.println("myHashSet before removing any element : " + myHashSet);
            myHashSet.remove(3);
            System.out.println("myHashSet after removing a element : " + myHashSet);

        }
    }


