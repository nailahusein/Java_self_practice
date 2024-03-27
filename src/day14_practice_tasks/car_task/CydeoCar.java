package day14_practice_tasks.car_task;

public class CydeoCar extends Car implements AutoPilot, Flyable {
    public CydeoCar(String make, String model, int year, double price, String color) {
        super("CydeoCar", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+" "+getModel()+" auto park mode is on");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake()+" "+getModel()+" auto pilot mode is on");
    }

    @Override
    public void start() {
        System.out.println("use voice control to start "+getMake()+" "+getModel());
    }

    @Override
    public void drive() {
        System.out.println("Driving "+getMake()+" "+getModel()+" on the road");
    }

    @Override
    public void fly() {
        System.out.println(getMake()+" "+getModel()+" can fly");
    }
}
//Create a Subclass of Car Named 'CydeoCar' that Implements AutoPark, AutoPilot, and Flyable Interfaces.