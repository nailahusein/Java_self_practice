package additional_practice_tasks;

import javax.swing.*;
import java.util.Scanner;

/*
Create a class named ATMSimulation. Write a program with the following requirements:

   1. Given the following variables:
      - pinNumber: contains the correct pin number of the card
      - accountBalance: current account balance of the card

   2. Ask the user to enter their pin number.
      If the user-entered pin number does not match the correct pin number, give 2 more attempts for user to re-enter.
      		"Incorrect Pin Number, Please re-enter:"

      If all the attempts are failed, then the program should be terminated with the following error message:
      	"Your card is locked. Please contact with your local bank"

   3. If user entered the valid pin number, Ask the user to select from one of the three following options:
      	3.1 Check Balance:
          Displays the available balance.

      	3.2 Deposit Money:
          Asks the user to enter the amount to deposit and displays the new available balance.

          If the user enters an invalid amount (0 or negative), then the program should
          be terminated with the following error message:
          	"Depositing amount cannot be zero or negative, please try again later."

      	3.3 Withdraw Money:
          Asks the user to enter the amount to withdraw and displays the new available balance.

          If the user enters an invalid amount (0 or negative), then the program should
          be terminated with the following error message:
          	"Cannot withdraw zero or negative amount, please try again later."

          If the user-entered amount is greater than the available balance, then the program
          should be terminated with the following error message:
          	"Insufficient funds. Withdrawal failed."

	   	3.4 If the user does not select one of the three options above, then the following
   			error message should be displayed on the console:
	      		"Invalid choice. Exiting the ATM. Thank you for using our services!"

 */
public class ATMSimulation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int pinNumber = 1234;
        double accountBalance = 1250.00;

        System.out.println("Enter your Pin Number:");
        int number = input.nextInt();

        int maxAttempts = 2;
        int attempts = 0;

        while (attempts <= maxAttempts) {
            attempts++;
            if (attempts <= maxAttempts && number != pinNumber) {
                System.out.println("Incorrect Pin Number, Please re-enter:");
                number = input.nextInt();
            } else if (attempts > maxAttempts && number != pinNumber) {
                System.err.println("Your card is locked. Please contact with your local bank");
            }
        }

        if (number == pinNumber) {
            System.out.println("Select from one of the three following options:");
        }

        input.nextLine();

        System.out.println("Check Balance\nDeposit Money\nWithdraw Money");
        String answer = input.nextLine();


            switch (answer) {
                case "Check Balance":
                    System.out.println(accountBalance);
                    break;
                case "Deposit Money":
                    System.out.println("Enter the amount to deposit:");
                    double deposit = input.nextDouble();

                    if (deposit <= 0)
                        System.err.println("Depositing amount cannot be zero or negative, please try again later.");

                    double newBalance1 = accountBalance + deposit;

                    System.out.println("New balance: " + newBalance1);

                    break;
                case "Withdraw Money":
                    System.out.println("Enter the amount to withdraw:");
                    int withdraw = input.nextInt();

                    if (withdraw <= 0) {
                        System.err.println("Cannot withdraw zero or negative amount, please try again later.");
                    } else if (withdraw > accountBalance) {
                        System.err.println("Insufficient funds. Withdrawal failed.");
                    }

                    double newBalance2 = accountBalance - withdraw;

                    System.out.println("New balance: " + newBalance2);
                    break;

                default:
                    System.err.println("Invalid choice. Exiting the ATM. Thank you for using our services!");
                    break;
            }


    }
}



















