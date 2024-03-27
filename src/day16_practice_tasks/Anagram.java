package day16_practice_tasks;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "abcd";
        String str2 = "ccddabaa";

        Set<String> s1 = new TreeSet<>(Arrays.asList(str1.split("")));
        Set<String> s2 = new TreeSet<>(Arrays.asList(str2.split("")));

        boolean isAnagram = s1.equals(s2);

        System.out.println("isAnagram = " + isAnagram);

    }

}


/*
Create a class named Anagram and write a program that checks if two strings are anagrams of each other, considering only the distinct characters in each string (ignoring duplicates).

         Example1:
            str1 = "abcd"
            str2 = "ccddabaa"

         Output:
            true


         Example2:
            str1 = "xyze"
            str2 = "xyzd"

         Output:
            false
 */