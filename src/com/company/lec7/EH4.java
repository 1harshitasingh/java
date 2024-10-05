package com.company.lec7;


public class EH4 {
    public static int greet(){
        try{
            int a = 5;
            int b = 0;
            int c = a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Cleaning up resources...This is the end of this function");
        }
        return -1;
    }

    public static void main(String[] args) {
      greet();

        }
    }



