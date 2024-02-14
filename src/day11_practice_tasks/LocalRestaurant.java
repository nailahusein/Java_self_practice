package day11_practice_tasks;

import java.util.Arrays;

public class LocalRestaurant {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Daisy Lee", "Hollywood", 5);

        Server server1 = new Server("John",56789,20.0, true);
        Server server2 = new Server("Kyle", 78901, 18.5,false);

        Server[] servers = {server1, server2};

        Chef chef1 = new Chef("Jordan", 23456, 25.5, false);
        Chef chef2 = new Chef("James", 45890, 27.0, true);

        Chef[] chefs = {chef1, chef2};

        restaurant.hireServer(servers);
        restaurant.hireChef(chefs);
        System.out.println(Arrays.toString(chefs));
        System.out.println(Arrays.toString(servers));
        System.out.println(restaurant);
        server1.washDishes();
        server2.makeOrder();
        chef1.washDishes();
        chef2.makeOrder();


    }
}




/*
Create a class named LocalRestaurant with a main method:
	Create a Restaurant object
	Create an array of servers and chefs with their information set
	Add the initial servers and chefs to the respective ArrayLists in the Restaurant object
	Print the whole restaurant's information
 */
