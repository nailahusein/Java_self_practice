package day04_practice_tasks;
/*
Create a class called Grade. A char variable named grade is given.
   Write a program to print the following messages:

		'A': Excellent
		'B': Great job
		'C': Good
		'D': Passed
		'F': Failed
		Otherwise: Invalid Grade

			Example:
				   grade = 'B'

			Output:
				  Great job
 */
public class Grade {

    public static void main(String[] args) {

        char grade = 'B';

        String result;

        if (grade == 'A'){
            result = "Excellent";
        }else if (grade == 'B'){
            result = "Great job";
        }else if (grade == 'C'){
            result = "Good";
        }else if (grade == 'D'){
            result = "Passed";
        }else if (grade == 'F'){
            result = "Failed";
        }else{
           result = "Invalid";
        }

        System.out.println(result);
    }
}
