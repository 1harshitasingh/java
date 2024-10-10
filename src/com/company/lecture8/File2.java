package com.company.lecture8;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File2 {
    public static void main(String[] args) {

        File myFile = new File("file1.txt");
        try {
            FileWriter fileWriter = new FileWriter("file1.txt");
            fileWriter.write("Java .\nKeep learning, Keep coding!");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
