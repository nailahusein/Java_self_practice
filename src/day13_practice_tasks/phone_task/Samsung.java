package day13_practice_tasks.phone_task;

public class Samsung extends Phone{


    public Samsung(String brand, String model, String size, String color, double price) {
        super(brand, model, size, color, price);
    }
}

/*
 Create a class named 'Samsung' with these specifications:
   Attributes:
       - Same as IPhone.

   Encapsulation:
       - Same conditions as IPhone.

   Constructor:
       - Same as IPhone.

   Actions:
       - call(phoneNumber): Display "calling the number [phoneNumber]".
       - text(phoneNumber): Display "texting to the number [phoneNumber]".
       - toString(): Prints the information of the Samsung object.
 */