package com.company.lecture2;

public class Practice5 {
    public static void printFib(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        System.out.println(a);
        printFib(b, a + b, n - 1);
    }

    public static void main(String args[]) {
        printFib(0, 1, 10);
    }
}


