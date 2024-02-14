package day05_practice_tasks;
/*
Create a class named EnglishAlphabetsBackward, and write a program that can display the alphabet letters from Z to A in
the same line separated by a space.
 */
public class EnglishAlphabetsBackward {

    public static void main(String[] args) {

        System.out.println("English Alphabet Backward:");

        for (char i = 'Z'; i >= 'A' ; i--) {
            System.out.print(i + " ");
        }
    }
}
