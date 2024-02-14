package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

/*
Create a class called SameFirstAndLast and write a program with the following specifications:
    11.1 Given an ArrayList of strings, remove elements if the first and last characters of the string are the same.

			Example:
				list = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"}

			output:
				["Canada", "Lan", "Ebrahim", "Farida"]



 */
public class SameFirstAndLast {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));

        list.removeIf(p -> p.toLowerCase().charAt(0) == p.toLowerCase().charAt(p.length() -1 ));

        System.out.println(list);


    }
}
