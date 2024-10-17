package com.company.lec9;

 class Circle {

    private double radius;

    public Circle(double radius) {

        this.radius = radius;
    }

    public double getRadius() {

        return radius;
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }


    public double getArea() {

        return Math.PI * radius * radius;
    }


    public double getCircumference() {

        return 2 * Math.PI * radius;
    }
}
public class RC {

    public static void main(String[] args) {

        int r = 5;

        Circle circle = new Circle(r);

        System.out.println("Radius of the circle is " + r);
        System.out.println("The area of the circle is " + circle.getArea());
        System.out.println("The circumference of the circle is " + circle.getCircumference());
    }
 }