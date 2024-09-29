package com.company.lec5;


class Circle {
    public int radius;

    Circle() {
        System.out.println(" non param of circle");
    }

    Circle(int r) {
        System.out.println(" parameterized constructor");
        this.radius = r;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}

class Cylinder1 extends Circle {
    public int height;

    Cylinder1(int r, int h) {
        super(r);
        System.out.println("cylinder1 parameterized constructor");
        this.height = h;
    }

    public double volume() {
        return Math.PI * this.radius * this.radius * this.height;
    }
}

public class Question3 {
    public static void main(String[] args) {

        Cylinder1 obj = new Cylinder1(12, 4);
        System.out.println("volume of cylinder:" + obj.volume());
        Circle c = new Circle();
        c.radius = 12;
        System.out.println(c.area());


    }
}


