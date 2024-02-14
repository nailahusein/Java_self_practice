package day13_practice_tasks.employee_task;

public class Employee {

    private String name, employeeId, jobTitle, companyName;
    private double salary;

    public Employee(String name, String employeeId, String jobTitle, String companyName, double salary) {
       setName(name);
       setEmployeeId(employeeId);
       setJobTitle(jobTitle);
       setCompanyName(companyName);
       setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
        if (salary < 0){
            System.err.println("Salary can not be negative");
            System.exit(1);
        }
    }

    public void work(){
        System.out.println(name + " works as " + jobTitle);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name = '" + name + '\'' +
                ", employeeId = '" + employeeId + '\'' +
                ", jobTitle = '" + jobTitle + '\'' +
                ", companyName = '" + companyName + '\'' +
                ", salary = $" + salary +
                '}';
    }
}


/*
Employee Task Requirements:
1. Create a subclass of Person named "Employee" with the following specifications:
   Attributes:
       - employeeId: String
       - jobTitle: String
       - salary: double
       - companyName: String

   Encapsulation:
       - Same as previous tasks.

   Constructor:
       - Same as previous tasks.

   Methods:
       - work(): Displays the employee's job title and name.
       - toString(): Returns a string representation of the Employee object.

2. Create the following subclasses of Employee:
   2.1 Tester:
       - work(): Displays "[jobTitle] [name] is testing".

   2.2 Developer:
       - Extra Variable:
           - programmingLanguage: String
       - work(): Displays "[jobTitle] [name] is coding in [programmingLanguage]".

   2.3 Teacher:
       - work(): Displays "[name] is teaching".

   2.4 Driver:
       - work(): Displays "[name] is driving".

   - Add any additional fields or methods as necessary.

3. Create a class named "EmployeeClients":
   - Create multiple objects representing different employees.
   - Test the methods and attributes of each object.


 */