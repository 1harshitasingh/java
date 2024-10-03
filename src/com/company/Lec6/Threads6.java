package com.company.Lec6;


class Threaddd1 extends Thread {
    public void run() {
        System.out.println("Welcome");
    }
}

class Threaddd2 extends Thread {
    public void run() {
        System.out.println("Good morning");
    }
}

public class Threads6 {
    public static void main(String[] args) {
        Threaddd1 t1 = new Threaddd1();
        Threaddd2 t2 = new Threaddd2();
        t1.start();
        t2.start();
        t1.setPriority(5);
        t2.setPriority(1);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t1.getState());
        System.out.println(t2.getState());
    }
}

