package com.company.lecture2;

import java.security.SecureRandom;

public class Factorial {
    static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }

        else {
            return n* factorial(n-1);
        }
    }
    public static void main(String[]args){
        int n=4;
        System.out.println("the value of factoraial:" + factorial(n));
    }
}
