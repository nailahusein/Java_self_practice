package day16_practice_tasks;

import java.util.*;

public class RemoveDublicates {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(
                20, 15, 10, 20, 30, 10, 20, 15, 0
        ));

        Set<Integer> set = new TreeSet<>(numbers);

        System.out.println(set);

    }

}

/*
Create a class named RemoveDuplicates and write a program that takes a list of integers, removes any duplicate values, and returns the elements in sorted order.

         Example:
            {20, 15, 10, 20, 30, 10, 20, 15, 0}

         Output:
            {0, 10, 15, 20, 30}

 */