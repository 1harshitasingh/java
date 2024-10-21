package com.company.lec10;

import java.util.Scanner;

public class PracticeQ2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(" first number: ");
        double x = in.nextDouble();
        System.out.print("second number: ");
        double y = in.nextDouble();
        System.out.print(" third number: ");
        double z = in.nextDouble();
        System.out.println(" average is " + average(x, y, z));
    }

    public static double average(double x, double y, double z) {
        return (x + y + z) / 3;
    }
}
