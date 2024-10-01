package com.company.lec5;

interface Animal {

    default void say() {
        System.out.println(" Default method");
    }


    void bark();
}

 class A1 implements Animal {

    @Override
    public void bark() {
        System.out.println("Dog barks!");
    }

}

    public class Q3 {
        public static void main(String[] args) {
            A1 obj1 = new A1();
            obj1.bark();
            obj1.say();

        }
    }




