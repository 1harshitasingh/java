package com.company.lec5;


interface Bicycle1 {
    int a = 45;

    void applyBrake(int decrement);

    void speedUp(int increment);
}

interface Horn1 {
    int x = 45;

    void horn();

    void horn1();
}

class ACycle implements Bicycle1, Horn1 {

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

public class Q2 {
    public static void main(String[] args) {
        ACycle cy = new ACycle();
        cy.applyBrake(1);

        System.out.println(cy.a);
        System.out.println(cy.x);

        cy.horn();
        cy.horn1();
    }
}

