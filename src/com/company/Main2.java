package com.company;

import java.util.Scanner;
import java.util.Random;

    public class Main2 {
        public static void main(String[] args) {


            // Question 2
        byte m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in Physics");
        m1 = sc.nextByte();

       System.out.println("Enter your marks in Chemistry");
        m2= sc.nextByte();

       System.out.println("Enter your marks in Mathematics");
       m3 = sc.nextByte();
        float avg = (m1+m2+m3)/3.0f;
        System.out.println("Your Overall percentage is: " + avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulations, You have been promoted");
        }
        else{
            System.out.println("Sorry, You have not been promoted! Please try again.");
        }


        }
    }


