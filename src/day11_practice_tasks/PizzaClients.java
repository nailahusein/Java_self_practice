package day11_practice_tasks;

public class PizzaClients {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("Small", 3, 2);

        pizza1.calcCost();

        System.out.println(pizza1);

        Pizza pizza2 = new Pizza("Medium", 1, 5);

        pizza2.calcCost();

        System.out.println(pizza2);

        Pizza pizza3 = new Pizza("Large", 4, 7);

        pizza2.calcCost();

        System.out.println(pizza3);
    }
}

