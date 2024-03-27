package day14_practice_tasks.device_task;

public class DeviceShop {

    public static void main(String[] args) {
        Desktop desktop = new Desktop("Dell","Inspiron", 559.99,"White","8GB",true, true);
        Google google = new Google("Google","Pixel 7a",374,"Coral","256GB",true,true);
        Iphone iphone = new Iphone("Iphone", "12Pro",599,"Space grey","256GB",true, true );
        Laptop laptop = new Laptop("HP","Pavilions Plus", 559.99,"Natural Silver","16GB",true, true);
        PersonalComputer personalComputer = new PersonalComputer("Lenovo","ThinkSystem ST650 V3",3976.44, "Black","16GB",true, true);
        Samsung samsung = new Samsung("Samsung","Galaxy S24",1200,"Black Titanium","256GB",true, true);

        google.downloadApp();
        iphone.downloadApp();
        samsung.downloadApp();

        System.out.println(desktop);
        System.out.println(google);
        System.out.println(iphone);
        System.out.println(laptop);
        System.out.println(personalComputer);
        System.out.println(samsung);
    }
}
/*
Create a Class Named 'DeviceShop':
    - Instantiate an object from each concrete class.
    - Test all functions of each object.
    - Analyze the relationships between the classes.

 */