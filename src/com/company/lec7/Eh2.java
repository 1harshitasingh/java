package com.company.lec7;

import java.util.Scanner;

public class Eh2 {
    public static void main(String[] args) {
        int marks[] = {7, 56, 6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of index");
        int ind = sc.nextInt();
        try {
            System.out.println("Welcome");
            try {
                System.out.println(marks[ind]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index does not exist");
                System.out.println("Exception in level 2");
            }
        } catch (Exception e) {
            System.out.println("Exception in level 1");
        }
    }
}
