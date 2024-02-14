package day06_practice_tasks;
/*
Create a class named DayAndMonth:

	3.1 Create a method named day that displays the day's name based on the given number.
	If the number is invalid, print "Invalid Number".

			Example:
				day(5);

			Output:
				Friday

	3.2 Create a method named monthName that displays the month's name based on the given number.
	If the number is invalid, print "Invalid Number."


			Example:
				monthName(6);

			Output:
				June

	3.3 Create a method named daysInMonth that displays the number of days in the month based on the given number.
	If the number is invalid, print "Invalid Number."

				Example:
					daysInMonth(6);

				Output:
					June has 30 days

 */
public class DayAndMonth {
    public static void main(String[] args) {
        displayDay(5);
        monthName(6);
        daysInMonth(6);

    }

    public static void displayDay(int day ){

        String result = switch (day) {
            case 1 -> result = "Monday";
            case 2 -> result = "Tuesday";
            case 3 -> result = "Wednesday";
            case 4 -> result = "Thursday";
            case 5 -> result = "Friday";
            case 6 -> result = "Saturday";
            case 7 -> result = "Sunday";
            default -> result = "Invalid Number";
        };

        System.out.println(result);

    }

    public static void monthName(int month){
        String result = switch (month){
            case 1 -> result = "January";
            case 2 -> result = "February";
            case 3 -> result = "March";
            case 4 -> result = "April";
            case 5 -> result = "May";
            case 6 -> result = "June";
            case 7 -> result = "July";
            case 8 -> result = "August";
            case 9 -> result = "September";
            case 10 -> result = "October";
            case 11 -> result = "November";
            case 12 -> result = "December";
            default -> result = "Invalid number";
        };
        System.out.println(result);
    }

    public static void daysInMonth(int month){
        switch (month){
            case 2:
                System.out.println("28 days");
                break;
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("31 days");
                break;
            case 4, 6, 9, 11:
                System.out.println("30 days");
                break;
            default:
                System.err.println("Invalid Number");

        }


    }
}
