package com.company.lec4;

class Cylinder1 {
    private int radius;
    private int height;

    public Cylinder1(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea() {
        return (2 * 3.14 * radius * radius )+( 2 * 3.14 * radius * height);
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }


}

public class Q {
    public static void main(String[] args) {


        Cylinder1 c = new Cylinder1(9, 12);
        c.setHeight(12);
        System.out.println(c.getHeight());
        c.setRadius(9);
        System.out.println(c.getRadius());

        System.out.println(c.surfaceArea());
        System.out.println(c.volume());
    }
}