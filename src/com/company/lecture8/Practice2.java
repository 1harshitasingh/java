package com.company.lecture8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Practice2 {
        public static void main(String[] args) {
            LocalDateTime dt = LocalDateTime.now();
            DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");
            String myDate = dt.format(df);
            System.out.println(myDate);
        }
    }


