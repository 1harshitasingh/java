package com.company.Lec6;

import java.util.ArrayList;

class Thread11 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Welcome");
        }
    }
}

class Thread22 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good morning");
        }
    }
}

public class Practiceset1 {
    public static void main(String[] args) {
        Thread11 t1 = new Thread11();
        Thread22 t2 = new Thread22();
        t1.start();
        t2.start();
    }
}

