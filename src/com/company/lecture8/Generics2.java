package com.company.lecture8;


interface Exp{
    void meth1(int a, int b);
}

class ExpDemo{
    public static void main(String[] args) {

        Exp obj =(a,b)->{
            System.out.println("The value of a and b is : "+ a + "," + b);
        };
        obj.meth1(5,10);
    }
}
