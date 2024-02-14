package day09_practice_tasks;

public class EvenOddNumbers {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int oddNumbers = 0;
        int evenNumbers = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0){
                evenNumbers++;
            }else{
               oddNumbers++;
            }
        }

        System.out.println("The array has " + oddNumbers + " odd numbers and " + evenNumbers + " even numbers.");

    }

}
/*
Create a class named EvenOddNumbers and write a program that counts the even and odd numbers from an array of integers.

			Example:
				array = {1, 2, 3, 4, 5, 6, 7};

			Output:
				The array has 4 odd numbers and 3 even numbers.

 */
