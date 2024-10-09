package com.company.lecture8;

import java.io.File;
import java.io.IOException;


public class File1 {


    public static void main(String[] args) {

        File myFile = new File( "File1.txt");
        try {
            myFile.createNewFile();

        } catch (IOException e) {
            System.out.println("File created successfully.");
            e.printStackTrace();
        }
    }

}

