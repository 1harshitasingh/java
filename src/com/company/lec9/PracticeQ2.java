package com.company.lec9;

import java.util.Scanner;

public class PracticeQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write a");
        int a = sc.nextInt();

        System.out.println("writ b");
        int b = sc.nextInt();
        System.out.println("a is " + a + " and b is " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping, a is " + a + " and b is " + b);
    }

}
