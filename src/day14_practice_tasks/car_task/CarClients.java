package day14_practice_tasks.car_task;

public class CarClients {

    public static void main(String[] args) {
        Audi audi = new Audi("Audi","Q6", 2014,32000,"Red" );
        BMW bmw = new BMW("BMW","i320",2014,20000,"Black");
        CydeoCar cydeoCar = new CydeoCar("CydeoCar","N100",2024,50000, "Pink");
        Honda honda = new Honda("Honda", "Civic", 2008, 6500,"Grey");
        Mercedes mercedes = new Mercedes("Mercedes", "GLA250",2021,24888,"Black");
        Nio nio = new Nio("Nio", "UX456",2023, 43500,"Green");
        Tesla tesla = new Tesla("Tesla","Model 3",  2015, 45000, "White");
        Toyota toyota = new Toyota("Toyota", "Venza",2023,41000,"Blue");


        audi.autoPark();
        bmw.drive();
        cydeoCar.fly();
        honda.start();
        mercedes.autoPark();
        nio.selfDrive();
        tesla.start();
        toyota.drive();

        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(cydeoCar);
        System.out.println(honda);
        System.out.println(mercedes);
        System.out.println(nio);
        System.out.println(tesla);
        System.out.println(toyota);

    }
}
/*
 Create a Class Named 'CarClients':
    - Instantiate an object from each concrete class.
    - Test all functions of each object.
    - Analyze the relationships between the classes.
 */
