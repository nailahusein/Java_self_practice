package day14_practice_tasks.car_task;

public class Honda extends Car{
    public Honda(String make, String model, int year, double price, String color) {
        super("Honda", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Twist the key to ignition to start "+getMake()+" "+getModel());
    }

    @Override
    public void drive() {
        System.out.println("Driving "+getMake()+" "+getModel()+" on the road");
    }
}
// Create a Subclass of Car Named 'Honda'.