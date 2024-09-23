package com.company;

import java.util.Scanner;

public class Main5 {


    public static void main(String[] args) {

        System.out.println("Enter the year to be checked");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 )
            System.out.println("Leap year");
        else
            System.out.println("Not a leap year");
    }

}
