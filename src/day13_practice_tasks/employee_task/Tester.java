package day13_practice_tasks.employee_task;

public class Tester extends Employee {

    public Tester(String name, String employeeId, String jobTitle, String companyName, double salary) {
        super(name, employeeId, jobTitle, companyName, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is testing");
    }
}
