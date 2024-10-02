package com.company.Lec6;

abstract class Telephone {
    abstract void ring();

    abstract void lift();



}
class STelephone extends Telephone{
    void ring() {
        System.out.println("ringing");
    }
    void lift(){
        System.out.println("lift");

    }

    void disconnect(){
        System.out.println("disconnect");
    }

}


public class Ptactice3 {
    public static void main(String[] args) {
        Telephone t=new STelephone();
        t.ring();
    }
}
