package com.company.Lec6;

interface TvRemote {
    void turnon();

    void turnoff();

    void changechannel();
}

 interface SmartTvRemote extends TvRemote {
    void connectWifi();
}


abstract class MySmartTvRemote implements SmartTvRemote {
    public void turnon() {
        System.out.println("turning on the tv");
    }

    public void turnoff() {
        System.out.println("turning off the  tv");
    }

    public void connectWifi() {
        System.out.println("connected to wifi");
    }

    public abstract void changechannel();

}

class STv extends MySmartTvRemote {
    public void changechannel() {
        System.out.println("change channel");
    }
}

public class Practice4 {
    public static void main(String[] args) {
        SmartTvRemote t = new STv();
            t.turnon();
            t.turnoff();
        }
    }
