package com.company.lec9;


public class Classroom {

    private String className;
    private String[] students;


    public Classroom(String className, String[] students) {

        this.className = className;
        this.students = students;
    }


    public void printClassroom() {
        System.out.println("Class Name: " + className);
        System.out.print("Students: ");
        for (String student : students) {
            System.out.print(student + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        String[] studentArray = {"Ana", "Rohn", "john"};

        Classroom c = new Classroom("Science 101", studentArray);

        c.printClassroom();
    }
}
