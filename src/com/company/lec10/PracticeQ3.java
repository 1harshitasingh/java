package com.company.lec10;

public class PracticeQ3 {
    static int sum(int... arr) {
        int result = 0;
        for (int a : arr) {
            result += a;
        }

        return result;

    }


    public static void main(String[] args) {
        System.out.println("sum of 4 and 5 is :" + sum(4, 5));
        System.out.println("sum of 4,5 and 6 is :" + sum(4, 5, 6));
        System.out.println("sum of 4 ,5,6,7 and 8 is :" + sum(4, 5, 6, 7, 8));
        System.out.println("sum of 40 and 50 is :" + sum(40, 50));
        System.out.println("sum of 40 and 60 is :" + sum(40, 60));
        System.out.println("sum of  is :" + sum());



    }
}
