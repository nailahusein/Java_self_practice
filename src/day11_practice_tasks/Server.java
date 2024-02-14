package day11_practice_tasks;

public class Server {

    public String name;
    public int employeeId;
    public double hourlyRate;
    public boolean fullTime;

    public Server(String name, int employeeId, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeId = employeeId;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public void makeOrder(){
        System.out.println(name  + " is making an order");
    }

    public void washDishes(){
        System.out.println(name  + " is washing the dishes");
    }


    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + fullTime +
                '}';
    }
}



/*
Create a custom class named Server with similar specifications:

	Attributes:
			name (String)
			employeeID (int)
			hourlyRate (double)
			fullTime (boolean)

	Add A constructor that can set all the fields.

    Actions:
		makeOrder(): prints chef's name + " is making an order"
		washDishes(): prints chef's name + " is washing the dishes"
		toString(): returns a string representation of a Chef, including full-time or part-time status

 */