package com.company;

public class Main1 {
    public static void main(String[]args){
        String name= "HARSHITA";
        int value =name.length();
        System.out.println(value);
        String a  =name.toLowerCase();
        System.out.println(a);
        String b = name.toUpperCase();
        System.out.println(b);
        System.out.println(name.substring(1));
        System.out.println(name.substring(1,7));
        System.out.println(name.indexOf("R"));
        System.out.println(name.indexOf("R", 2));


    }
}
