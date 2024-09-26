package com.company.lec4;


class Employee1 {
    int id;
    int salary;
    String name;

    public void printDetails() {
        System.out.println("My id is " + id);
        System.out.println("and my name is " + name);
    }

    public int getSalary() {
        return salary;
    }
}

public class OOPS2 {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee1 E1 = new Employee1();
        Employee1 E2 = new Employee1();


        E1.id = 12;
       E1.salary = 34;
       E1.name = "HARSHITA";


        E2.id = 17;
        E2.salary = 12;
       E2.name = "RON";


        E1.printDetails();
        E2.printDetails();

        System.out.println("Salary of E1: " + E1.getSalary());
        System.out.println("Salary of E2: " + E2.getSalary());


    }
}


