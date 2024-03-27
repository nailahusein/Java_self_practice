package day14_practice_tasks.device_task;

public class Google extends Phone implements AndroidApps {
    public Google(String brand, String model, double price, String color, String finalSize, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, finalSize, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand()+" "+getModel()+" is downloading apps from "+APPStoreName);
    }
}
/*
'Google':
        - Extends Phone class.
        - Implements Downloadable & AndroidApps interfaces.
 */