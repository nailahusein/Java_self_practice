package day12_practice_tasks;

public class RectangleClients {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();

        rectangle1.setLength(5.5);
        rectangle1.setWidth(4.5);
        rectangle1.calcArea();
        rectangle1.calcPerimeter();

        System.out.println(rectangle1);
    }
}
