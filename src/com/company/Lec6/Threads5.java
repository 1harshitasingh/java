package com.company.Lec6;

import java.util.ArrayList;

class Threadd1 extends Thread{
    public void run(){
        try {
            Thread.sleep(200);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Welcome");
    }
}
class Threadd2 extends Thread {
    public void run() {
        System.out.println("Good morning");
    }
}
public class Threads5 {
    public static void main(String[] args) {
        Threadd1 t1= new Threadd1();
        Threadd2 t2= new Threadd2();
        t1.start();
        t2.start();
    }
}

