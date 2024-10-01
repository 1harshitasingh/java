package com.company.lec5;

interface AA {
    void meth1();

    void meth2();

}

interface B1 extends AA {
    void meth3();

    void meth4();
}

class C implements B1 {
    public void meth1() {
        System.out.println("meth1");
    }

    public void meth2() {
        System.out.println("meth2");
    }

    public void meth3() {
        System.out.println("meth3");
    }

    public void meth4() {
        System.out.println("meth4");
    }
}

public class Q5 {
    public static void main(String[] args) {
        C obj=new C();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
