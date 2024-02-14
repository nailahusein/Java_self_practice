package day12_practice_tasks;

public class CandyClients {

    public static void main(String[] args) {

        Candy candy1 = new Candy();

        candy1.setBrand("Herseys");
        candy1.setPrice(4.99);
        candy1.setQuantity(3);
        candy1.setHasPeanuts(false);

        System.out.println(candy1);

        Candy candy2 = new Candy();

        candy2.setBrand("M&M\'s");
        candy2.setPrice(0);
        candy2.setQuantity(5);
        candy2.setHasPeanuts(true);

        System.out.println(candy2);



    }
}
