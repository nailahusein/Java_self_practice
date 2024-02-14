package day03_practice_tasks;
/*
Create a class named GallonsToLiters and declare the following variables:
					gallon
					liters

	Write a program that converts any given number of gallons to liters.

					Example:
						gallon = 10

					Output:
						10 gallons is equal to 37.9 liters

			Hint: 1 gallon = 3.79 liters
 */
public class GallonsToLiters {

    public static void main(String[] args) {

        int gallon = 10;
        double liters = gallon * 3.79;

        System.out.println(gallon + " gallons is equal to " + liters + " liters" );


    }
}
