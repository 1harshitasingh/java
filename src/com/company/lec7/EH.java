package com.company.lec7;


public class EH {
    public static void main(String[] args) {
        int a = 5000;
        int b = 0;
        try {
            int c = a / b;
            System.out.println("Result is " + c);
        } catch (Exception e) {
            System.out.println("failed to divide. Reason: ");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}