package day12_practice_tasks;

public class Item {

    private String name;
    private int unitPrice;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank() || name.isEmpty()){
            System.err.println("Name can not be empty or blank: " + name);
            System.exit(1);
        }
        for (int i = 0; i < name.toCharArray().length; i++) {
            if (!Character.isLetterOrDigit(name.charAt(i))){
                System.err.println("Name can not contain any special characters other than space: " + name);
                System.exit(1);
            }else if(!Character.isLetter(name.charAt(0))){
                System.err.println("The name must start with letters: " + name);
                System.exit(1);
            }
        }
        this.name = name;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        if (unitPrice < 0){
            System.err.println("The unitPrice cannot be negative: " + unitPrice);
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0){
            System.err.println("The quantity cannot be negative: " + quantity);
        }
        this.quantity = quantity;
    }

    public int calcCost(){
        int totalCost = unitPrice * quantity;
        return totalCost;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name = '" + name + '\'' +
                ", unitPrice = $" + unitPrice +
                ", quantity = " + quantity +
                ", totalCost = $" + calcCost() +
                '}';
    }
}


/*
Create a custom class named Item with the following specifications:

	Attributes:
		name
		unitPrice
		quantity

	Ensure encapsulation for all fields.
		Conditions:
			The name cannot be empty or blank.
			The name cannot contain any special characters other than space.
			The name must start with letters.
			The unitPrice cannot be negative.
			The quantity cannot be negative.

	Add a constructor that enables the user to set all fields during object creation.

	Actions:
		calcCost(): Returns the total cost.
		toString(): Displays the name, unit price, quantity, and total cost calculated by calcCost() when the object is printed.

	Create another class named ItemClients, create multiple item objects, and test each function of the item object.
 */