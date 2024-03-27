package day17_practice_tasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "bbcccaaaaa";
        Map<String, Integer> frequencyMap = new LinkedHashMap<>();

        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);
            frequencyMap.put( each, frequency);
        }

        System.out.println(frequencyMap);

    }
}

/*
Create a class named FrequencyOfCharacters and write a program that returns the frequency of each
character in a given string as a map, without using nested loops.
         Example:
               string = "bbcccaaaaa"

         Output:
               {b=2, c=3, a=5}

 */