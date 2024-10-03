package com.company.Lec6;

class Thr extends Thread {
    public Thr(String name) {
        super(name);
    }

    public void run() {
        int i = 0;
        while (i <= 500) {
            System.out.println("Thread");
            i++;
        }
    }
}

public class Threads2 {
    public static void main(String[] args) {
        Thr t1=new Thr("John");
        Thr t2=new Thr("Ron");
        System.out.println("The id of the thread t1 is " + t1.getId());
        System.out.println("The name of the thread t1 is " + t1.getName());
        System.out.println("The id of the thread t2 is " + t2.getId());
        System.out.println("The name of the thread t2 is " + t2.getName());

    }
}
