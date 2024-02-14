package day13_practice_tasks.phone_task;

public class PhoneClients {

    public static void main(String[] args) {
        
        Iphone iphone = new Iphone("Iphone", "12 Max", "128 GB", "Grey",899.90);

        System.out.println(iphone);

        iphone.call("3456789009");
        iphone.text("3456789009");
        iphone.faceTime("3456789009");
        
        Samsung samsung = new Samsung("Samsung", "Galaxy A10e", "32GB", "Black", 82.57);

        System.out.println(samsung);

        samsung.call("2345678989");
        samsung.text("2345678989");
        samsung.faceTime("2345678989");
        
        Nokia nokia = new Nokia("Nokia", "C210", "32GB", "Charcoal", 109.99);

        System.out.println(nokia);

        nokia.call("4567894321");
        nokia.text("4567894321");
        nokia.faceTime("4567894321");





    }
}


/*
Create a class named "PhoneClients":
   - Create multiple objects representing different phones.
   - Test the methods and variables of each object.

 */