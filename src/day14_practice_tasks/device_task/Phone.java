package day14_practice_tasks.device_task;

public class Phone extends Device {
    public Phone(String brand, String model, double price, String color, String finalSize, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, finalSize, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Press the power-button to turn on the phone " + getBrand() + " " + getModel());
    }

    @Override
    public void turnOff() {
        System.out.println("Press the power-button to turn off the phone " + getBrand() + " " + getModel());
    }

    public void call(long phoneNum){
        System.out.println(getBrand() + " " + getModel() + " is calling " + phoneNum);
    }

    public void text(long phoneNum){
        System.out.println(getBrand() + " " + getModel() + " is texting to " + phoneNum);
    }

}
/*
Create a Child Abstract Class of Device Named 'Phone':
    - Extra Non-Abstract Methods:
        - call(long phoneNum)
        - text(long phoneNum)
        - toString()
 */