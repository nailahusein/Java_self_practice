package day08_practice_tasks;

import java.util.Scanner;

/*
Write a program that asks the user to enter first and last names and then prints the full name in regular format
        (first character in uppercase).

Example:
Input:
firstName = "cyDEo";
lastName = "SCHOOL";

Output:
Cydeo School

 */
public class EnterName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first and last names:");
        String firstName = input.nextLine();
        String lastName = input.next();

        input.close();

        String firstName1 = firstName.substring(0,1).toUpperCase() + 'y' +
                firstName.substring(2,4).toLowerCase() + 'o';

        String lastName1 = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(firstName1 + " " + lastName1);
    }
}
