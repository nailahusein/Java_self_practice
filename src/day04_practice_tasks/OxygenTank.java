package day04_practice_tasks;
/*
Create a class named OxygenTank. You are diving in the ocean. Your oxygen tank has a certain
level (number), and you must print a message based on the level:

		Above 90 - Your tank is full
		Above 80 - Still okay
		Above 70 - Don't go too far
		Above 60 - Start to head back
		Above 50 - Be careful, you're at 50%

			Example:
				   oxygenLevel = 75;

			Output:
				  Don't go too far
 */
public class OxygenTank {

    public static void main(String[] args) {

        int oxygenLevel = 75;

        String result;

        if (oxygenLevel >= 90){
           result = "Your tank is full";
        }else if (oxygenLevel >= 80){
            result = "Still okay";
        }else if (oxygenLevel >= 70){
            result = "Don't go too far";
        }else if (oxygenLevel >= 60){
            result = "Start to head back";
        }else if (oxygenLevel >= 50){
            result = "Be careful, you're at 50%";
        }else{
            result = "Invalid";
        }

        System.out.println(result);
    }
}
