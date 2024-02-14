package day12_practice_tasks;

public class ItemClients {

    public static void main(String[] args) {

        Item item1 = new Item();

        item1.setName("Book");
        item1.setQuantity(3);
        item1.setUnitPrice(12);

        item1.calcCost();

        System.out.println(item1);
    }
}
