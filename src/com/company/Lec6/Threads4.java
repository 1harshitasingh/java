package com.company.Lec6;

class NewThr extends Thread{
    public void run(){
        int i=0;
        while (i<=500){
            System.out.println("Thank you");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }

    }
}
class NewThr2 extends Thread{
    public void run(){
        int i=0;
        while(i<=1000){
            System.out.println("1111 Thank you");
            i++;
        }
    }
}
public class Threads4{
    public static void main(String[] args) {
        NewThr t1=new NewThr();
        NewThr2 t2=new NewThr2();
        t1.start();
        t2.start();
    }
}
