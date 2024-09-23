package com.company.lecture1;

public class Array2 {

    public static void main(String[] args) {

        float[] marks = {90.7f, 87.8f, 85.4f, 98.2f, 100.0f};
        float sum = 0;
        for (float element : marks) {
            sum = sum + element;
        }
        System.out.println("The value of sum is " + sum);


    }
}