package com.company.lecture1;

public class Arrays1 {
        public static void main(String[] args) {

            int [] marks = {98, 45, 79, 99, 80};

            System.out.println("Printing using Naive way");
            System.out.println(marks[0]);
            System.out.println(marks[1]);
            System.out.println(marks[2]);
            System.out.println(marks[3]);
            System.out.println(marks[4]);


            System.out.println("Printing using for loop");
            for(int i=0;i<marks.length;i++){
                System.out.println(marks[i]);
            }


            System.out.println("Printing using for loop in reverse order");
            for(int i=marks.length -1;i>=0;i--){
                System.out.println(marks[i]);
            }


            System.out.println("Printing using for-each loop");
            for(int element: marks){
                System.out.println(element);
            }

        }
    }



