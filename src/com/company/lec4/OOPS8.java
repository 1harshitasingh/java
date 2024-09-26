package com.company.lec4;

class MyEmployee {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;

    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
        id = i;
    }
}

public class OOPS8 {

    public static void main(String[] args) {
        MyEmployee a=new MyEmployee();
        a.setName("Harshita");
        System.out.println(a.getName());
        a.setId(11);
        System.out.println(a.getId());


    }
}
