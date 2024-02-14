package day07_practice_tasks;

public class EmployeeClients {
    public static void main(String[] args) {

       Employee employee1 = new Employee();
       employee1.name = "Naila Huseynova";
       employee1.age = 27;
       employee1.gender = 'F';
       employee1.jobTitle = "QA Tester";
       employee1.salary = 12_000;


        System.out.println(employee1);

        employee1.work();

        System.out.println("-------------------------------");

        Employee employee2 = new Employee();
        employee2.name = "Melike Dalman";
        employee2.age = 30;
        employee2.gender = 'F';
        employee2.jobTitle = "Teacher";
        employee2.salary = 14_000;

        System.out.println(employee2);

        employee2.work();


    }
}
