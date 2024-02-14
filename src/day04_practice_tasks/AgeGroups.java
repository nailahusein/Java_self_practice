package day04_practice_tasks;
/*
 Create a class named AgeGroups. An integer variable named age is given.
	Write a program that can determine the age group of a person. The age groups are:

		Teenager (0 ~ 20)
		Adult   (21 ~ 55)
      Senior  (55 or older)

		If the age is negative or greater than 150, print "Invalid."


			Example:
				   age = 42

			Output:
				  Young Middle-Aged Adult
 */
public class AgeGroups {

    public static void main(String[] args) {


        int age = 42;

        String result;

        if (age > 0 && age <= 20){
            result = "Teenager";
        }else if (age >= 21 && age < 55){
            result = "Young Middle-Aged Adult";
        }else if (age >= 55 ){
            result = "Senior";
        }else{
            result = "Invalid";
        }

        System.out.println(result);

    }
}
