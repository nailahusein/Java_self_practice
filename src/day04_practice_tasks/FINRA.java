package day04_practice_tasks;
/*
Create a class called FINRA. Write a function that prints out the number.
	For a number that is a multiple of 3, print "FIN" instead of the number.
	For a number that is a multiple of 5, print "RA" instead of the number.
	For a number that is a multiple of both 3 and 5, print "FINRA" instead of the number.

			Example:
				   number = 15

			Output:
				  FINRA

 */
public class FINRA {

    public static void main(String[] args) {


        int num = 15;


        String result = (num % 3 == 0 &&  num % 5 != 0) ? "FIN" : (num % 5 == 0 &&
                num % 3 != 0) ? "RA" : ( num % 3 == 0 && num % 5 == 0) ? "FINRA" : "Invalid";

        System.out.println(result);
    }
}
