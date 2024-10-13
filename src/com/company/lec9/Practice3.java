package com.company.lec9;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        int n, a = 0, b = 0, c = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times");
        n = sc.nextInt();
        System.out.println("Fibonacci Series of the number is:");
        for (int i = 0; i < n; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.println(a + "");
        }
    }
}
