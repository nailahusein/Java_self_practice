package day13_practice_tasks.employee_task;

public class EmployeeClients {

    public static void main(String[] args) {

        Tester tester = new Tester("Naila", "36907897","QA Tester", "Google",165_000);

        Developer developer = new Developer("Gulnar", "97451233", "Software Developer", "Facebook", 215_000, "JAVA");

        Teacher teacher = new Teacher("Melike", "93456790", "Teacher", "Little Butterflies", 120_000);

        Driver driver = new Driver("Cumali", "94497890", "Driver", "Uber", 85_000);

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);


        tester.work();
        developer.work();
        teacher.work();
        driver.work();

    }
}
