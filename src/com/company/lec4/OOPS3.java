package com.company.lec4;


class CellPhone {
    public void ring() {
        System.out.println("Ringing...");
    }

    public void vibrate() {
        System.out.println("Vibrating...");
    }

    public void callFriend() {
        System.out.println("Calling ...");
    }

}

public class OOPS3 {
    public static void main(String[] args) {



        CellPhone a = new CellPhone();
        a.callFriend();
        a.vibrate();
        a.ring();


    }
}

