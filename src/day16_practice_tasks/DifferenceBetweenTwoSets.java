package day16_practice_tasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DifferenceBetweenTwoSets {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(2, 3, 4));

        Set<Integer> set3 = new TreeSet<>();

        for (Integer each : set1) {
            if(!set2.contains(each)) {
                set3.add(each);
            }
        }

        System.out.println(set3);

        /*
          Set<Integer> set1 = new LinkedHashSet<>();
        set1.addAll(Arrays.asList(1, 2, 3, 5));

        Set<Integer> set2 = new LinkedHashSet<>();
        set2.addAll(Arrays.asList(2, 3, 4));

        Set<Integer> difference = new LinkedHashSet<>(set1);
        difference.removeAll(set2);

        System.out.println(difference);
         */
    }
}

/* Create a class named DifferenceBetweenTwoSets and write a program that calculates the difference between two sets of integers (elements in the first set but not in the second) and displays the result.

         Example:
            Set1 = {1, 2, 3, 5}
            Set2 = {2, 3, 4}

         Output:
            {1, 5}

 */