package additional_practice_tasks;

import java.util.Scanner;

/*
Create a class named CoffeeOrderApp with the following variables:

        - blackCoffeePrice: the price of black coffee
        - lattePrice: the price of a latte
        - cappuccinoPrice: the price of a cappuccino
        - totalPrice: the total cost of the user's order

    Create a straightforward coffee ordering application with these steps:

        Step 1. Ask the user if they want to order coffee.

            	Welcome to the Coffee Order App!

            Would you like to order coffee?


            If they say "yes", proceed to step #2. If they say "no", display "Thanks for using our service!"

            For any other response, the application should ask the user to re-enter until the user provides a valid entry.

        Step 2. Display the coffee options on the console:

            Coffee Options:
                1. Black Coffee - $blackCoffeePrice
                2. Latte - $lattePrice
                3. Cappuccino - $cappuccinoPrice

        Step 3. Ask the user to pick a coffee:

            3.1 If they choose 1, display "Added Black Coffee to Your Order."

            3.2 If they choose 2, display "Added Latte to Your Order."

            3.3 If they choose 3, display "Added Cappuccino to Your Order."

            3.4 If their choice is invalid, the application should ask the user to re-enter until the user provides a valid entry.


        Step 4. Ask if they want another order:

            If they say "yes," repeat from step #2.

            If they say "no," display the total cost of their order: "Your total is: $total."

            For any other response, the application should ask the user to re-enter until the user provides a valid entry.

 */
public class CoffeeOrderApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double blackCoffeePrice = 2.5;
        double lattePrice = 4.5;
        double cappuccinoPrice = 5.5;
        double totalPrice = 0;

        System.out.println("\tWelcome to the Coffee Order App!\n\n Would you like to order coffee? (Yes/No)");
        String answer = input.nextLine().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))){
            System.err.println("Invalid Entry, please re-enter! Would you like to order coffee?");
            answer = input.nextLine();
        }

        if (answer.equals("no")){
            System.out.println("Thanks for using our service!");
            return; //exits the main method
        }

        System.out.println("Coffee options:\n\t1. Black Coffee - $" + blackCoffeePrice + "\n\t2. Latte - $" + lattePrice +
                "\n\t3. Cappuccino - $" + cappuccinoPrice);
        System.out.println("Please pick a coffee:");
        int coffee = input.nextInt();

        while(!(coffee == 1 || coffee == 2 || coffee == 3)){
            System.err.println("Invalid entry, please re- enter:");
            coffee = input.nextInt();
        }

        switch(coffee){
            case 1 -> System.out.println("Added Black Coffee to Your Order.");
            case 2 -> System.out.println("Added Latte to Your Order.");
            case 3 -> System.out.println("Added Cappuccino to Your Order.");
        }

        input.nextLine();

        System.out.println("Would you like to make another order?");
        String response = input.nextLine().toLowerCase();

        while (!(response.equals("yes") || response.equals("no"))){
            System.err.println("Invalid Entry, please re-enter! Would you like to make another order?");
            response = input.nextLine();
        }

        double total = 0.0;

        if (response.equals("no")){
            if(coffee == 1){
                total = blackCoffeePrice;
            }else if (coffee == 2){
                total = lattePrice;
            }else if (coffee == 3){
                total = cappuccinoPrice;
            }
            System.out.println("Your total is: $" + total);
            return; //exits the main method
        }

        if (response.equals("yes")) {
            System.out.println("Coffee options:\n\t1. Black Coffee - $" + blackCoffeePrice + "\n\t2. Latte - $" + lattePrice +
                    "\n\t3. Cappuccino - $" + cappuccinoPrice);
            System.out.println("Please pick a coffee:");
            int coffee2 = input.nextInt();

            while (!(coffee2 == 1 || coffee2 == 2 || coffee2 == 3)) {
                System.err.println("Invalid entry, please re- enter:");
                coffee2 = input.nextInt();
            }

            switch (coffee2) {
                case 1 -> System.out.println("Added Black Coffee to Your Order.");
                case 2 -> System.out.println("Added Latte to Your Order.");
                case 3 -> System.out.println("Added Cappuccino to Your Order.");
            }

            double total2 = 0.0;

            if(coffee == 1){
                total = blackCoffeePrice;
            }else if (coffee == 2){
                total = lattePrice;
            }else if (coffee == 3) {
                total = cappuccinoPrice;
            }

            if(coffee2 == 1){
                total2 = blackCoffeePrice;
            }else if (coffee2 == 2){
                total2 = lattePrice;
            }else if (coffee2 == 3) {
                total2 = cappuccinoPrice;
            }

            double endPrice = total + total2;
            System.out.println("Your total is: $" + endPrice);

        }

        input.close();








    }
}
