package day08_practice_tasks;
/*
Create a class called EmailTask1. Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that can swap the first name with the last name in the email
(separated by an underscore). If the email doesn't contain an underscore, print the given input email.

        Example:
              Input:
                 mike_tyson@gmail.com

              Output:
                  tyson_mike@gmail.com
 */
public class EmailTask01 {

    public static void main(String[] args) {

        String emailAddress = "mike_tyson@gmail.com";


        if (emailAddress.contains("_")){
            String result = emailAddress.replace("mike_tyson@gmail.com", "tyson_mike@gmail.com");
            System.out.println(result);
        }else{
            System.out.println(emailAddress);
        }
    }
}
