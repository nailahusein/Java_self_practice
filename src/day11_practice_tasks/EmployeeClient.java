package day11_practice_tasks;

public class EmployeeClient {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Naila", 27,'F', "SDET", 100_000);

        employee1.work();

        System.out.println(employee1);


        Employee employee2 = new Employee("Gulnar", 26,'F', "Software Developer", 150_000);

        employee2.work();

        System.out.println(employee2);

        Employee employee3 = new Employee("Melike", "Teacher");

        employee3.work();

        System.out.println(employee3);


    }
}

