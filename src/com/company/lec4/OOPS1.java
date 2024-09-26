package com.company.lec4;

class Employee {
        int id;
        int salary;
        String name;
        public void printDetails(){
            System.out.println("My id is " + id);
            System.out.println("and my name is "+ name);
        }


        }


    public class OOPS1 {
        public static void main(String[] args) {
            System.out.println("This is our custom class");
            Employee E1 = new Employee();
            Employee E2 = new Employee();
            E1.name="Harshita";
            E2.name="Ron";
            E1.printDetails();
            E2.printDetails();


        }
    }


