package day05_practice_tasks;
/*
Create a class named SumOfNumbers and write a program to calculate the sum of all numbers between 1 and any given number.

				Example 1:
					   number = 100

				Output:
					  5050


				Example 2:
					    number = 50

				Output:
					  1275

 */
public class SumOfNumbers {

    public static void main(String[] args) {

       int sum1 = 0;

        for (int i = 1; i <= 100; i++) {
            sum1 +=i;
        }
        System.out.println("Sum of numbers are " + sum1 );


        System.out.println("---------------------------");

        int sum2 = 0;

        for (int j = 1; j <= 50 ; j++) {
            sum2 += j;
        }

        System.out.println("Sum of numbers are: " + sum2);
    }
}
