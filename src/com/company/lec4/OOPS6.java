package com.company.lec4;

class rectangle {
    int Length;
    int breadth;

    public int area() {
        return Length * breadth;
    }

    public int perimeter() {
        return (Length + breadth) * 2;
    }

}

public class OOPS6 {
    public static void main(String[] args) {


        rectangle r = new rectangle();
        r.Length = 4;
        r.breadth = 4;
        System.out.println(r.area());
        System.out.println(r.perimeter());

    }
}