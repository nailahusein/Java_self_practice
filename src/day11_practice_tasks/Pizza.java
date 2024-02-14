package day11_practice_tasks;

public class Pizza {

    public String size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;
    public static int price;
    public static int cheeseToppingPrice = 2;

    public static int pepperoniToppingPrice = 2;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }


    public int calcCost() {
//        if (size.equals("Small")) {
//            price = 10;
//        } else if (size.equals("Medium")){
//            price = 12;
//        }else if (size.equals("Large")){
//            price = 14;
//        }

        switch (size){
            case "Small" -> price = 10;
            case "Medium" -> price = 12;
            case "Large" -> price = 14;
        }
        int totalCost = price + numberOfCheeseTopping * cheeseToppingPrice + numberOfPepperoniTopping * pepperoniToppingPrice;
         return totalCost;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size ='" + size + '\'' +
                ", numberOfCheeseTopping = " + numberOfCheeseTopping +
                ", numberOfPepperoniTopping = " + numberOfPepperoniTopping +
                ", totalCost = $" + calcCost() + '}';
    }
}



/*
 Create a custom class named Pizza with the following specifications:

    Attributes:
		   size
		   numberOfCheeseTopping
		   numberOfPepperoniTopping

	Actions:
		calcCost(): returns the totalCost of the pizza
		toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

   Pizza cost is determined by:
   		Small: $10 + $2 per topping
   		Medium: $12 + $2 per topping
   		Large: $14 + $2 per topping

    Create another class named PizzaClients, create multiple pizza objects, and test each function of the pizza object.

 */