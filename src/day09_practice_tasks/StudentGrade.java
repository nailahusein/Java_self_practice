package day09_practice_tasks;

import java.util.Arrays;

public class StudentGrade {

    public static void main(String[] args) {

        String[] studentNames = {"Anna", "Nancy", "Sarah"};
        int[] scores = {90, 75, 80};

        char[] grade = new char[scores.length];

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] <= 100 && scores[i] > 0){
               if (scores[i] >= 90){
                   grade[i] = 'A';
               }else  if (scores[i] >= 80) {
                   grade[i] = 'B';
               }else  if (scores[i] >= 70) {
                   grade[i] = 'C';
               }else  if (scores[i] >= 60) {
                   grade[i] = 'D';
               }else  if (scores[i] >= 70) {
                   grade[i] = 'F';
               }
            }else{
                System.err.println("Invalid score");
            }

        }

        System.out.println("grades = " + Arrays.toString(grade));

        for (int i = 0; i < 3; i++) {
            System.out.println(studentNames[i] + "'s score is " + scores[i] + ", and grade is " + grade[i]);
        }


    }

}

/*
Create a class named StudentGrade and write a program with the following specifications:
	4.1 Given two arrays with the same length:
		   studentNames (String[])
		   scores (int[])

   	4.2 Write a program to determine and store the students' grades in an array of characters named grades.
 */
