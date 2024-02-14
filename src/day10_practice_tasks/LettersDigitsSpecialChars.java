package day10_practice_tasks;

import java.util.ArrayList;

/*
Create a class called LettersDigitsSpecialChars and write a program with the following specifications:
   1.1 Given a string, retrieve and display the letters, digits, and special characters separately.
   Example:

	        Example:
	            str = "Wooden Spoon123!"

	        output:
	            letters= "WoodenSpoon";
	            Digits = "123";
	            specialChars = " !";

 */
public class LettersDigitsSpecialChars {

    public static void main(String[] args) {

        String str = "Wooden Spoon123!";

        String letters = "",
                digits = "",
                specialChars = "";

        for (char each : str.toCharArray()) {
            if (Character.isLetter(each)){
                letters += each;
            }else if (Character.isDigit(each)){
                digits += each;
            }else{
                specialChars += each;
            }

        }

        System.out.println("letters = " + "\"" + letters + "\"");
        System.out.println("Digits = " + "\"" + digits + "\"");
        System.out.println("specialChars = " + "\"" + specialChars + "\"" );


    }
}


