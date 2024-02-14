package day11_practice_tasks;

public class CydeoStudentClients {

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Naila", 27, 123456, 1, "B33", 7);

        student1.study();

        student1.attendClass();

        CydeoStudent.printSchoolName();

        CydeoStudent.printProgLanguage();


        System.out.println(student1);
    }
}
