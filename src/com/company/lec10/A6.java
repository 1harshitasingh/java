package com.company.lec10;

public class A6 {
    public static void main(String[] args) {
        int[] n = {8, 12, 20, 30, 19};
        int largest = n[0];
        int smallest = n[0];

        for (int num : n) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
            System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);

        }
    }
