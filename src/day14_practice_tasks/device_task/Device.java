package day14_practice_tasks.device_task;

public abstract class Device {

    private final String brand, model;
    private double price;
    private String color;
    private String finalSize;
    private boolean hasBattery;
    private boolean hasPowerButton;

    public Device(String brand, String model, double price, String color, String finalSize, boolean hasBattery, boolean hasPowerButton) {
        if(brand == null || brand.isEmpty()){
            terminate("Invalid brand: " + brand);
        }
        this.brand = brand;

        if(model == null || model.isEmpty()){
            terminate("Invalid model: " + model);
        }
        this.model = model;

        if(price <= 0){
            terminate("Invalid price: " + price);
        }
        this.price = price;

        if(color == null || color.isEmpty()){
            terminate("Invalid color: " + color);
        }
        this.color = color;

        if(finalSize == null || finalSize.isEmpty()){
            terminate("Invalid size: " + finalSize);
        }
        this.finalSize = finalSize;

        this.hasBattery = hasBattery;
        this.hasPowerButton = hasPowerButton;
    }

    private void terminate(String message) {
        System.err.println(message);
        System.exit(1);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFinalSize() {
        return finalSize;
    }

    public void setFinalSize(String finalSize) {
        this.finalSize = finalSize;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public abstract void turnOn();

    public abstract void turnOff();

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand = '" + brand + '\'' +
                ", model = '" + model + '\'' +
                ", price = " + price +
                ", color = '" + color + '\'' +
                ", finalSize = '" + finalSize + '\'' +
                ", hasBattery = " + hasBattery +
                ", hasPowerButton = " + hasPowerButton +
                '}';
    }
}
/*
Create an Abstract Class Named 'Device':
    - Variables:
        - final brand
        - final model
        - price
        - color
        - final size
        - hasBattery
        - hasPowerButton
    - Encapsulate all fields.
    - Constructor: Initializes all fields.
    - Conditions:
        - brand, model, color, and size must not be null or empty.
        - price must be positive.
    - Abstract Methods:
        - turnOn()
        - turnOff()
    - Non-Abstract Method:
        - toString()
 */