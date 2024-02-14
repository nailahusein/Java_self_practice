package m10_variables_data_types;
/*
Create a class named StudentInfo and write a program with the following requirements:
     studentName
     age
     gender
     schoolName
     studentId
     gradeLevel
     gpa
 */
public class StudentInfo {

    public static void main(String[] args) {

        String studentName = "Josh Steven";
        int age = 22;
        String gender = "Male";
        double gpa = 2.8;
        String schoolName = "MIT";
        String gradeLevel = "Undergraduate";
        String studentId = "A125";

        System.out.println("The student\'s name is "+studentName+".");
        System.out.println("Gender is "+gender+".");
        System.out.println("Age is "+age+" years old.");
        System.out.println("The school\'s name is "+schoolName+".");
        System.out.println("Grade level is "+gradeLevel+".");
        System.out.println("Josh Steven\'s GPA is "+gpa+".");
        System.out.println("Student ID number is "+studentId+".");



    }
}
