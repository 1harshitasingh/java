package com.company.lec5;


interface Bicycle {
    int a = 45;

    void applyBrake(int decrement);

    void speedUp(int increment);
}

interface Horn {
    int x = 45;

    void horn();

    void horn1();
}

class AvonCycle implements Bicycle, Horn {

    void blowHorn() {
        System.out.println("horn");
    }

    public void applyBrake(int decrement) {
        System.out.println("Applying Brake");
    }

    public void speedUp(int increment) {
        System.out.println("Applying SpeedUP");
    }

    public void horn() {
        System.out.println("Abc");
    }

    public void horn1() {
        System.out.println("Break");
    }
}

public class Q5 {
    public static void main(String[] args) {
        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.applyBrake(1);

        System.out.println(cycleHarry.a);
        System.out.println(cycleHarry.x);

        cycleHarry.horn();
        cycleHarry.horn1();
    }
}
