package day09_practice_tasks;

import java.util.Arrays;

public class ClassMatesInitials {

    public static void main(String[] args) {

        String[] classMates = {"Naila Huseynova", "Narmin Mehraliyeva", "Aigerim Abish", "Anna Shlykova", "Brian Morton", "Dina Muntean",
                "Mert Yildirim","Makhad Ksd", "Maksim Bakhtin", "Shukria Stanikzai"};


        String[] initials = new String[classMates.length];


        for (int i = 0; i < classMates.length; i++) {
           
            initials[i] = classMates[i].charAt(0) + "." + classMates[i].charAt( classMates[i].indexOf(" ") + 1 ) + ".";
            String initial = initials[i];
            System.out.println(initial);
        }


    }
}
/*
 Create a class named ClassMatesInitials and write a program with the following specifications:
   2.1 Create an array of strings named classmates.
   2.2 Store full names of 10 classmates.
   2.3 Print the initials of each student's name in separate lines.
 */

