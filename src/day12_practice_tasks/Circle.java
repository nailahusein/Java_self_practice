package day12_practice_tasks;

public class Circle {

    private double radius;


    public void setRadius(double radius) {
        if (radius <= 0) {
            System.err.println("The radius can not be negative or zero value: " + radius);
            System.exit(1);
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    public double calcArea(){
        double area = Math.round(Math.pow(getRadius(),2) * Math.PI);
        return area;
    }

    public double calcPerimeter(){
        double perimeter =Math.round(2 * getRadius() * Math.PI);
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius = " + radius +
                ", area = " + calcArea() +
                ", perimeter = " + calcPerimeter() +
                '}';
    }
}


/*
 Create a custom class named Circle with the following specifications:

	Attributes:
		radius

	Ensure encapsulation for the field.
		Condition:
			The radius cannot be set to a negative or zero value.

	Add a constructor that allows the user to set the field during object creation.

	Actions:
		calcArea(): Calculates and returns the area of the circle object.
		calcPerimeter(): Calculates and returns the perimeter of the circle object.
		toString(): Displays the radius, area, and perimeter of the circle when the object is printed.

	Create another class named CircleClients, create multiple circle objects, and test each function of the circle object.

 */