package com.company.lecture2;

public class M {

    int multiply(int a,int b){
        return a*b;
    }
    double multiply(double a,double b){
        return  a*b;
    }

    public static void main(String[] args) {

        M obj = new M();
        int c = obj.multiply(5,4);
        double d = obj.multiply(5.1,4.2);
        System.out.println( c);
        System.out.println( d);

    }
}


