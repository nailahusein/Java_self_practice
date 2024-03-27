package day14_practice_tasks.device_task;

public class Samsung extends Phone implements AndroidApps{
    public Samsung(String brand, String model, double price, String color, String finalSize, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, finalSize, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand()+" "+getModel()+" is downloading apps from "+APPStoreName);
    }
}
/*
'Samsung':
        - Extends Phone class.
        - Implements Downloadable & AndroidApps interfaces.
 */