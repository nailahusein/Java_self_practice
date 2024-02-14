package day07_practice_tasks;
/*
  Example:
                      buildingNumber = 7925;
                      street = "Jones Branch Dr";
                      city = "McLean";
                      state = "VA";
                       zipCode = 22012;

                  Output:
                        7925 Jones Branch Dr
                        McLean Va, 22012
 */
public class AddressClient {

    public static void main(String[] args) {

        Address address1 = new Address();
        address1.buildingNumber = 7925;
        address1.street = "Jones Branch Dr";
        address1.city = "McLean";
        address1.state = "VA";
        address1.zipCode = 22012;

        System.out.println(address1);

    }
}
