package com.company.Lec6;

class ThreadRunnable implements Runnable {
    public void run() {
        int i = 0;
        while (i <= 10000) {
            System.out.println("Thread 11");
            i++;
        }
    }

}

class ThreadRunnable1 implements Runnable {
    public void run() {
        int i = 0;
        while (i <= 10000) {
            System.out.println("Thread22");
            i++;

        }

    }

}

public class Threads1 {
    public static void main(String[] args) {
        ThreadRunnable r1 = new ThreadRunnable();
        Thread t1 = new Thread(r1);

        ThreadRunnable1 r2 = new ThreadRunnable1();
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}
