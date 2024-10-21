package com.company.lec10;

import java.util.Scanner;

public class PracticeQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" first number: ");
        double x = sc.nextDouble();
        System.out.print("Second number: ");
        double y = sc.nextDouble();
        System.out.print("third number: ");
        double z = sc.nextDouble();
        System.out.println("The smallest value is " + smallest(x, y, z));
    }

    public static double smallest(double x, double y, double z) {
        return Math.min(Math.min(x, y), z);
    }
}
