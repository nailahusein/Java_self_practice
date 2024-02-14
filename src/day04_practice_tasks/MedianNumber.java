package day04_practice_tasks;
/*
Create a class named MedianNumber. Write a program that finds the median number between
three DIFFERENT given integers (Assume that the given three integers are distinct numbers).

			Example:
				   a = 10;
				   b = 15;
				   c = 20;

			Output:
				  15 is the median number

 */
public class MedianNumber {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 20;

        if (a > b && a < c){
            System.out.println(a + " is the median number");
        }else if (b > a && b < c){
            System.out.println(b + " is the median number");
        }else if (c > a && c < b){
            System.out.println(c + " is the median number");
        }else{
            System.err.println("Invalid");
        }
    }
}
