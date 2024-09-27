package com.company.lec4;

class Sphere {

    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

    public class Q2 {
        public static void main(String[] args) {
            Sphere s=new Sphere();
            s.setRadius(10);
            System.out.println(s.getRadius());

        }

    }

