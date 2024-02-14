package day10_practice_tasks;
/*
Create a class called UpperCaseAndLowerCase and write a program with the following specifications:
   2.1 Given a string, return true if the total number of uppercase characters is equal to the total number of lowercase characters.

	        Eamplex:
	            str = "JAVA java";

	        output:
	            true

 */
public class UpperCaseAndLowerCase {

    public static void main(String[] args) {

        String str = "JAVA java";

        String upperCase = "",
                lowerCase = "";



        for (char each : str.toCharArray()) {
            if (Character.isLetter(each)) {
                if (Character.isUpperCase(each)) {
                    upperCase += each;
                } else {
                    lowerCase += each;
                }
            }
        }

        System.out.println(upperCase);
        System.out.println(lowerCase);

        System.out.println(upperCase.length() == lowerCase.length());
    }
}
