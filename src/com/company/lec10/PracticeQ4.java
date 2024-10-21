package com.company.lec10;

public class PracticeQ4 {
    public static void printNumbers(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        printNumbers(n-1);
    }

    public static void main(String[] args) {
        int n=5;
        printNumbers(5);
    }
}
