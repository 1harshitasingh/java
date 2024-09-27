package com.company.lec4;


class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 19;
        name = "ABC";
    }
    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }
    public MyMainEmployee(String myName){
        id = 1;
        name = myName;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}

public class OOPS9 {
    public static void main(String[] args) {

        MyMainEmployee E = new MyMainEmployee();
        System.out.println(E.getId());
        System.out.println(E.getName());
    }
}


