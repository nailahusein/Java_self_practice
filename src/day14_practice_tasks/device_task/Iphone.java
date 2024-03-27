package day14_practice_tasks.device_task;

public class Iphone extends Phone implements AppleApps{
    public Iphone(String brand, String model, double price, String color, String finalSize, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, finalSize, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand()+" "+getModel()+" is downloading apps from "+APPStoreName);
    }
}
/*
 - 'Iphone':
        - Extends Phone class.
        - Implements Downloadable & AppleApps interfaces.
 */