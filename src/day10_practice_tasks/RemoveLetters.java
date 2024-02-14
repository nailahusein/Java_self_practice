package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
Create a class called RemoveLetters and write a program with the following steps:
    10.1 Given an ArrayList of characters, remove all the letters.

			Example:
				list = {'$', A', 'B', '1', '2', 'c', 'd', '@', '!', '3', '4'}

			output:
				['$',  '1', '2', '@', '!', '3', '4']


 */
public class RemoveLetters {

    public static void main(String[] args) {


        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));

        list.removeIf(p -> Character.isLetter(p));

        System.out.println(list);






    }
}
