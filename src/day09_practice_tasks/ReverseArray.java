package day09_practice_tasks;

import java.util.Arrays;

/*
Create a class named ReverseArray and write a program to reverse an array of integers and return it as a new one.

			Example:
				array = {1,2,3,4,5};

			Output:
				reversedArray = {5,4,3,2,1};

 */
public class ReverseArray {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        int[] reversedArray = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = array[i];
        }
        System.out.println("reversedArray = " + Arrays.toString(reversedArray));
    }
}
