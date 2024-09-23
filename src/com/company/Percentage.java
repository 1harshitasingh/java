package com.company;
import java .util.Scanner;

public class Percentage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first subject mark: ");
        int a= sc.nextInt();

        System.out.println("Enter second subject mark: ");
        int b= sc.nextInt();

        System.out.println("Enter third subject mark: ");
        int c= sc.nextInt();

        System.out.println("Enter fourth subject mark: ");
        int d= sc.nextInt();

        System.out.println("Enter fifth subject mark: ");
        int e= sc.nextInt();

        int total;

        total = a+ b+ c+ d+ e;
        float percentage = (total/5);

        System.out.println("the percentage of marks are: "+percentage);





    }
}

