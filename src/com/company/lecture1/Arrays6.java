package com.company.lecture1;

public class Arrays6 {
    public static void main(String[] args) {

        int[] arr = {1, 2100, 3, 455, 5, 34, 67};
        int max = Integer.MIN_VALUE;
        for (int e : arr) {
            if (e > max) {
                max = e;
            }
        }
        System.out.println("the value of the maximum element in this array is: " + max);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);


    }
}