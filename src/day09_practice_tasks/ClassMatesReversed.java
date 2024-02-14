package day09_practice_tasks;

import java.util.Arrays;

/*
Create a class named ClassMatesReversed and write a program with the following specifications:
   6.1 Create an array of strings named classmates.
   6.2 Store full names of 10 classmates.
   6.3 Reverse each student's name and print them on separate lines.

 */
public class ClassMatesReversed {

    public static void main(String[] args) {

        String[] names = {"Sarah", "Josh", "Alice", "Naila", "David", "Sasha", "Mary", "Susan", "Edward", "Kyle"};

        String[] reverseName = new String[names.length];

        for (int i = names.length - 1, j = 0; i >= 0; i--, j++) {
            reverseName[j] = names[i];
            String reverseN = reverseName[j];
            System.out.println(reverseN);
        }

    }
}
