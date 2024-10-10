package com.company.lecture8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class File3 {


    public static void main(String[] args) {

        File myFile = new File("file1.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

