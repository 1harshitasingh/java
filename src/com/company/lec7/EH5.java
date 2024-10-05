package com.company.lec7;


import java.util.Scanner;

public class EH5 {
    public static void main(String[] args) {
        boolean flag = true;
        int[] marks = {82, 56, 93};
        Scanner Sc = new Scanner(System.in);
        int index;
        int i = 0;
        while (flag && i < 5) {
            try {
                System.out.println("Enter the value of index");
                index = Sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                break;
            } catch (Exception e) {
                System.out.println("Invalid Index");
                i++;
            }
        }
        if (i >= 5) {
            System.out.println("Error");
        }


    }
}

