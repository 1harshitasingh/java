package com.company.lecture8;

interface AB{
    void display();
}

public class PracticeQuestion {
    public static void main(String[] args) {
        AB i = () ->
                System.out.println("I am display");
        i.display();
    }
}