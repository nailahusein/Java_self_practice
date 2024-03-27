package day14_practice_tasks.device_task;

public class Computer extends Device{
    public Computer(String brand, String model, double price, String color, String finalSize, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, finalSize, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Press the power-button to turn on the computer " + getBrand() + " " + getModel());
    }

    @Override
    public void turnOff() {
        System.out.println("Press the power-button to turn off the computer " + getBrand() + " " + getModel());
    }
}
