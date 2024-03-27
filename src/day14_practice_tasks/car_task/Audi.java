package day14_practice_tasks.car_task;

public class Audi extends Car implements AutoPark{
    public Audi(String make, String model, int year, double price, String color) {
        super("Audi", model, year, price, color);
    }


    @Override
    public void drive() {
        System.out.println("Driving "+getMake()+" "+getModel()+" on the road");
    }

    @Override
    public void start() {
        System.out.println("Press the start button to start "+getMake()+" "+getModel());
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+" "+getModel()+" auto park mode is on");
    }
}
// Create two Subclasses of Car ('Audi' and 'Mercedes') that Implement the AutoPark Interface.