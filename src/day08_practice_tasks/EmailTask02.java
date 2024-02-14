package day08_practice_tasks;
/*
Create a class called EmailTask2. Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that will print out information about the user based on the email.
Print the first name, last name, and domain. First and last names should be printed with the proper format.
(uppercase first letter and remaining lowercase)

        Example:
              Input:
                 craig_federighi@apple.com

              Output:
                   First name: Craig
                   Last name: Federighi
                   Domain: apple

 */
public class EmailTask02 {
    public static void main(String[] args) {

        String emailAddress = "craig_federighi@apple.com";

        String firstName = emailAddress.substring(0,5);
        //String firstName1 = firstName.replaceFirst("c", "C");
        String firstName1 = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();

        String lastName = emailAddress.substring(6, 15);
        //String lastName1 = lastName.replaceFirst("f","F");
        String lastName1 = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

        String domain = emailAddress.substring(16,21);

        System.out.println("First name: " + firstName1 + "\n" +
                "Last name: " + lastName1 + "\n" + "Domain: " + domain);



    }
}
