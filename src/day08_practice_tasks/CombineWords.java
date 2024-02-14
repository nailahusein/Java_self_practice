package day08_practice_tasks;

import java.util.Scanner;

/*
Create a class named CombineWords. Ask the user to enter two words. Then, add them together and print. But if the
last letter of the first word and the first letter of the second word are the same, print that character once.

        Example:
              Input:
                 one
                 eight

              Output:
                   oneight

 */
public class CombineWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two words:");
        String firstWord = input.nextLine();
        String secondWord = input.next();

        if (firstWord.lastIndexOf("") == secondWord.indexOf(0)); {

           String secondWord2 = secondWord.substring(1);
           String result = firstWord.concat(secondWord2);

            System.out.println("result: " + result);
        }
    }
}
