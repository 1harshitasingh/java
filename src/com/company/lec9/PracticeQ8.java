package com.company.lec9;

    import java.util.ArrayList;
    import java.util.List;

public class PracticeQ8{
        public static void main(String[] args) {

            List<String> list= new ArrayList<String>();
            list.add("Red");
            list.add("Green");
            list.add("Orange");
            list.add("White");
            list.add("Black");

            System.out.println(list);

            list.add(0, "Pink");
            list.add(5, "Yellow");

            System.out.println(list);
        }
    }


