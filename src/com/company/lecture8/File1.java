package com.company.lecture8;

import java.io.File;
import java.io.IOException;

public class File1 {

    public static void main(String[] args) {
        File myFile = new File("File1.txt");
        try {
            if (myFile.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}
