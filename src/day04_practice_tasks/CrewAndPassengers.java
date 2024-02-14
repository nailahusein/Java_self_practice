package day04_practice_tasks;
/*
Create a class called CrewAndPassenger. Given the total number of people on the ship,
	determine how many should be crew members and how many can be passengers.

		Total: 50 ====> 20 crew, 30 passengers
		Total: 75 ====> 25 crew, 50 passengers
		Total: 100 ====> 30 crew, 70 passengers
		Any other number of people on the ship is not valid.
		Print how many of each type there should be.

			Example:
				   number = 75

			Output:
				  25 crew, 50 passengers
 */
public class CrewAndPassengers {

    public static void main(String[] args) {

        int totalNum = 75;

        String result;

        if (totalNum == 50){
            result = "20 crew, 30 passengers";
        }else if (totalNum == 75){
            result = "25 crew, 50 passengers";
        }else if (totalNum == 100){
            result = "30 crew, 70 passengers";
        }else{
            result = "Invalid";
        }

        System.out.println(result);
    }
}
