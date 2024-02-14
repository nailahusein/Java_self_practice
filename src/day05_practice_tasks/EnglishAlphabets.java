package day05_practice_tasks;
/*
Create a class named EnglishAlphabets, and write a program that displays alphabet letters from A to Z in the
same line separated by a space.

 */
public class EnglishAlphabets {
    public static void main(String[] args) {

        System.out.println("English Alphabet: ");

        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }
    }
}
