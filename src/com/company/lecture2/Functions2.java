package com.company.lecture2;

import java.util.*;

public class Functions2 {


    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


        int result = multiply(a, b);
        System.out.println(result);
    }
}


