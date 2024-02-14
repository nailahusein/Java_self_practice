package additional_practice_tasks;

import java.util.Scanner;

/*
Create a class named RoomReservationApplication and write a program with the following requirements:

	1. Display the following welcome message on the console:
			"Welcome to the Cydeo Skyline Inn!"

	2. Ask the user, "Would you like to reserve a room? (Yes/No)"

	3. If the user enters "No," then display the following message:
			"You have a wonderful day!"

	4. the user enters "Yes," then gather the following information:
		4.1 Ask the user's first name
		4.2 Ask the user's last name
		4.3 Ask the user's age
		4.4 Display the available room types and ask which type of room the user would like to reserve
		4.5 Ask how many nights the user wants to stay
		4.6 Ask if the user is a veteran

	5. For any other inputs, the application should ask the user to re-enter until the user provides a valid entry.

	6. Calculate the total price based on the selected room type and the number of nights the user is staying.
	Room types and their prices:
						Single Bed ==> $100
						Queen Bed  ==> $120
						King Bed   ==> $160

	7. Calculate the tax and grand total, assuming the sales tax is 8%.

	8. Calculate the total discount the user is eligible for:
		If the user is a senior (at least 64 years old), they are eligible for a senior discount (10%).
		If the user is a veteran, they are eligible for a veterans discount (15%).

	9. Display the user's first name, total cost, tax, total discounts, and grand total in the following format on the console:

				Example 1:
								Welcome to the Cydeo Skyline Inn!

					Agent: Would you like to reserve a room? (Yes/No)
					User: No

					Output:
						You have a wonderful day!


				Example 2:
								Welcome to the Cydeo Skyline Inn!

					Agent: Would you like to reserve a room? (Yes/No)
					User: Yes

					Agent: Please enter your first name:
					User: Jimmy

					Agent: Please enter your last name:
					User: Joe

					Agent: Please enter your age:
					User: 55

					Agent: Here are our available rooms and their prices:
									 King Bed   ===== $160
									 Queen Bed  ===== $120
									 Single Bed ===== $100

							Which room would you like to reserve? (King/Queen/Single)
					User: King

					Agent: How many nights would you like to stay?
					User: 3

					Agent: Are you a veteran? (Yes/No)
					User: No

					Output:
						Hello Jimmy, You have selected King Bed for 3 nights to stay.
						Room fee: $480.00
						Tax is: $38.40

						Your grand total is: $518.40

 */
public class RoomReservationApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double singleBed = 100.0;
        double queenBed  = 120.0;
        double kingBed   = 160.0;


        System.out.println("Welcome to the Cydeo Skyline Inn!\nWould you like to reserve a room? (Yes/No)");
        String answer = input.nextLine().toLowerCase();

        while(!(answer.equals("yes") || answer.equals("no"))){
            System.err.println("Invalid entry, please re-enter:");
        }

        if (answer.equals("no")){
            System.out.println("You have a wonderful day!");
            return;
        }


        System.out.println("Please enter your first name:");
        String firstName = input.nextLine();

        System.out.println("Please enter your last name:");
        String lastName = input.nextLine();

        System.out.println("Please enter your age:");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Here are our available rooms and their prices:\nKing Bed ===== $160\nQueen Bed ===== $120\nSingle Bed ===== $100");
        System.out.println("Which room would you like to reserve? (King/Queen/Single)");
        String roomType = input.nextLine().toLowerCase();

        System.out.println("How many nights would you like to stay?");
        int nights = input.nextInt();

        input.nextLine();

        System.out.println("Are you a veteran? (Yes/No)");
        String veteran = input.nextLine().toLowerCase();


        input.close();



//        while((firstName.equals(null) || lastName.equals(null) || age <= 0 || roomType.equals(null) || nights <= 0
//                || veteran.equals(null))){
//            System.err.println("Invalid entry, please re-enter:");
//            input.nextLine();
//            input.nextInt();
//        }


        double roomPrice = 0.0;
        if (roomType.equals("single")){
            roomPrice = singleBed;
        }else if (roomType.equals("queen")){
            roomPrice = queenBed;
        }else if (roomType.equals("king")){
            roomPrice = kingBed;
        }

        double roomFee = roomPrice * nights;

        double salesTax = 0.08;

        double tax = roomFee * salesTax;

        double grandTotal = roomFee + tax;

        if (veteran.equals("yes")){
            double veteranDiscount = 0.15;
            grandTotal *= 0.15;
            }
        if (age >= 64){
            double seniorDiscount = 0.1;
            grandTotal *= 0.1;
        }

        System.out.println("Hello " + firstName + ", " + "You have selected " + roomType + " bed for " + nights + " nights to stay.\n" +
                "Room fee: $" + roomFee + "\n" + "Tax is: $" + tax +"\n" + "\n" + "Your grand total is: $" + grandTotal);


    }
}
