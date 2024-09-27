package com.company.lec4;

class Cylinder{

    private int radius;
    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

public class OOPS10 {
    public static void main(String[] args) {


        Cylinder a = new Cylinder();
        a.setHeight(12);
        a.setRadius(5);
        int h= a.getHeight();
         int r=  a.getRadius();
        System.out.println(h);
        System.out.println(r);

    }
}