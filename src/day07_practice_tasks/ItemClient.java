package day07_practice_tasks;

public class ItemClient {
    public static void main(String[] args) {

        Item item1 = new Item();
        item1.itemName = "Balloon";
        item1.unitPrice = 2.5;
        item1.quantity = 50;
        item1.totalCost = item1.unitPrice * item1.quantity;

        item1.calcCost();

        System.out.println(item1);

        System.out.println("---------------------------------");

        Item item2 = new Item();
        item2.itemName = "T-shirt";
        item2.unitPrice = 25.00;
        item2.quantity = 15;
        item2.totalCost = item2.unitPrice * item2.quantity;

        item2.calcCost();

        System.out.println(item2);
    }
}
