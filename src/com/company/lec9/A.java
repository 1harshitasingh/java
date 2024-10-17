package com.company.lec9;

public class A{

    private int x;
    private int y;


    public A(int x, int y) {

        this.x = x;
        this.y = y;
    }


    public A(double x, double y) {

        this.x = (int) x;
        this.y = (int) y;
    }


    public void printA() {

        System.out.println("Point (x, y): (" + x + ", " + y + ")");
    }


    public static void main(String[] args) {

       A A1 = new A(4, 5);

       A1. printA();


        A A2 = new A(4.5, 5.5);

        A2.printA();
    }
}
