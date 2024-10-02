package com.company.Lec6;

abstract class pen {
    abstract void write();

    abstract void refill();

}

class Fountainpen extends pen {
    void write() {
        System.out.println("write");
    }

    void refill() {
        System.out.println("refill");

    }

    void changenib() {
        System.out.println("change nib");
    }

}

public class Practice1 {
    public static void main(String[] args) {
        Fountainpen p = new Fountainpen();
        p.changenib();
        p.refill();
    }
}
