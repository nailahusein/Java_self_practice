package day07_practice_tasks;

import java.util.Scanner;

/*
Create a class named GradeReport and write a program asking the user to enter their score and print the student's grade.

  If the user enters an invalid score (negative or more than 100), print "Invalid Score."

        Example:
             Enter your score:
             Input: 85

        Output:
             Your grade is B
 */
public class GradeReport {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your grade:");
        int score = input.nextInt();

       input.close();

if (score >= 0 && score <=100 ){
    if ( score >= 90 && score <= 100){
        System.out.println("Your grade is A");
    }else if (score >= 75 ){
        System.out.println("Your grade is B");
    }else if(score >= 70 ){
        System.out.println("Your grade is C");
    }else if (score >= 60){
        System.out.println("Your grade is D");
    }else if (score < 60){
        System.out.println("Your grade is F");
    } else {
        System.err.println("Invalid Score");
    }

}

      

    }
}
