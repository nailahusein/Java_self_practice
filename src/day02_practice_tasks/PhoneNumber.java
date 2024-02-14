package m10_variables_data_types;
/*
Create a class named PhoneNumber and declare the following variables:
    countryCode
    areaCode
    localNumber
 */
public class PhoneNumber {

    public static void main(String[] args) {

        int countryCode = 1;
        int areaCode = 703;
        int localNumber = 4512625;

        System.out.println("Phone number is: +"+countryCode+"("+areaCode+")-"+localNumber);
    }
}
