package day13_practice_tasks.phone_task;

public class Phone {

    private String brand = "",
            model = "",
            size = "",
            color = "";
    private double price;

    public Phone(String brand, String model, String size, String color, double price) {
        setBrand(brand);
        setColor(color);
        setSize(size);
        setModel(model);
        setPrice(price);

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        if(price < 0){
            System.err.println("Price can not be negative");
            System.exit(1);
        }
    }

    public void call(String phoneNumber){
        System.out.println( "calling the number " + phoneNumber);
    }

    public void text(String phoneNumber){
        System.out.println( "texting to the number " + phoneNumber);
    }

    public void faceTime(String phoneNumber){
        System.out.println( "facetiming with the number " + phoneNumber);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + '{' +
                " brand = '" + brand + '\'' +
                ", model = '" + model + '\'' +
                ", size = '" + size + '\'' +
                ", color = '" + color + '\'' +
                ", price = $" + price +
                '}';
    }
}



/*
 Create a custom class named 'IPhone' with these specifications:
   Attributes:
       - brand: String
       - model: String
       - size: String
       - price: double
       - color: String

   Encapsulation:
       - All fields must be private with getters and setters.
       Conditions for Encapsulation:
           - The 'brand', 'model', and 'color' must not be null, empty, or blank.
           - The 'price' must be greater than zero.

   Constructor:
       - Add a constructor to initialize all fields.

   Actions:
       - call(phoneNumber): Display "calling the number [phoneNumber]".
       - text(phoneNumber): Display "texting to the number [phoneNumber]".
       - faceTime(phoneNumber): Display "facetiming with the number [phoneNumber]".
       - toString(): Prints the information of the IPhone object.

 */