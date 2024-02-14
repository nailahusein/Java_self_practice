package day05_practice_tasks;
/*
Create a class named Rectangle. Use a loop to print the following shape on the console:

			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *

 */
public class Rectangle {

    public static void main(String[] args) {


        for (int i = 1; i <= 9 ; i++) {
            for (int j = 1; j <= 8; j++) {
                System.out.print("* ");
            }

            System.out.println();

        }
    }
}
