package m10_variables_data_types;
/*
Create a class named EmployeeInfo and write a program with the following requirements:
    employeeName
    age
    gender
    companyName
    jobTitle
    yearsOfExperience
    salary
    isFullTime
    isMarried
    employeeId

 */
public class EmployeeInfo {

    public static void main(String[] args) {

        String employeeName = "Shay";
        int age = 24;
        char gender = 'F';
        String companyName = "Apple Inc";
        String jobTitle = "SDET";
        double yearsOfExperience = 2.5;
        int salary = 120_000;
        boolean isFullTime = true;
        boolean isMarried = false;
        String employeeId = "B101";

        System.out.println("Employee name: "+employeeName+"\nGender: "+gender+"");
        System.out.println("Age: "+age+"\nEmployee ID: "+employeeId+"");
        System.out.println("Job title: "+jobTitle+"\nCompany Name: "+companyName+"");
        System.out.println("Full time: "+isFullTime+"\nYears of experience: "+yearsOfExperience+"");
        System.out.println("Salary: "+salary+"\nMarried: "+isMarried+"");






    }
}
