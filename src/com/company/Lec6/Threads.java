package com.company.Lec6;

class Thread1 extends Thread {
    public void run() {
        int i=0;
        while (i<=1000) {
            System.out.println("thread1");
            System.out.println("Running");
            i++;
        }
    }
}

class Thread2 extends Thread {
    public void run(){
        int i=0;
        while(i<=1000){
        System.out.println("Thread2");
            System.out.println("Happy");
            i++;
    }
}
}

public class Threads {
    public static void main(String[] args) {
        Thread1 t1 =new Thread1();
        Thread2 t2=new Thread2();
        t1.start();

        t2.start();
    }
}
