package day14_practice_tasks.car_task;

public class Nio extends Car implements AutoPilot{
    public Nio(String make, String model, int year, double price, String color) {
        super("Nio", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel() + " auto park mode is on");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + " " + getModel() + " auto pilot mode is on");
    }

    @Override
    public void start() {
        System.out.println("Press the start button to start " + getMake() + " " + getModel());
    }

    @Override
    public void drive() {
        System.out.println("Driving " + getMake() + " " + getModel() + " on the road");
    }
}
//Create two Subclasses of Car ('Tesla' and 'Nio') that Implement both AutoPark and AutoPilot Interfaces.