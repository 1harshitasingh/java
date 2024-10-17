package com.company.lec9;


public class Dog {
    private String name;
    private String color;


    public Dog(String name, String color) {

        this.name = name;

        this.color = color;
    }


    public static void main(String[] args) {

        Dog myDog = new Dog("Gold", "Black");

        System.out.println("Dog's Name: " + myDog.name);
        System.out.println("Dog's Color: " + myDog.color);
    }
}
