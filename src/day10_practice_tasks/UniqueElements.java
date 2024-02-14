package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
Create a class called UniqueElements and write a program with the following specifications:
   9.1 Given an ArrayList, display the unique elements without using any loops.

			Example:
				list = [1, 1, 2, 3, 3, 4, 5, 5]

			output:
				[2, 4]

 */
public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5));

        list.retainAll(Arrays.asList(2, 4));

        System.out.println(list);


        System.out.println("---------------------");

        ArrayList<Integer> uniqueElements = new ArrayList<>(list);

        uniqueElements.removeIf(p -> Collections.frequency(uniqueElements, p) > 1);

        System.out.println(uniqueElements);

    }
}
