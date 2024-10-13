package com.company.lec9;

import java.util.Scanner;

public class PracticeQ1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("dividing the number by 0");
        try{
            System.out.println(n/0);

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
