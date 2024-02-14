package day13_practice_tasks.student_task;

public class StudentClients {

    public static void main(String[] args) {

        Student student = new Student("Melike", "Female", 31);

        Student1 student1 = new Student1("Gulnar", "Female", 26, "TR89786", "International Relations", "Istanbul University", 'A');

        GraduateStudent graduateStudent = new GraduateStudent("Cumali", "Male",29, "TR897654", "Turism", "Duzce University",'B');

        UnderGraduateStudent underGraduateStudent = new UnderGraduateStudent("Elif", "Female", 24, "TR678900", "Dietitian", "Izmir University", 'A');

        CydeoStudent cydeoStudent = new CydeoStudent("Naila", "Female", 27, "3456781", "QA Tester", "CYDEO", 'A', 33, 7, "JAVA");


        System.out.println(student);
        System.out.println(student1);
        System.out.println(graduateStudent);
        System.out.println(underGraduateStudent);
        System.out.println(cydeoStudent);

        student1.study();
        graduateStudent.study();
        underGraduateStudent.study();
        cydeoStudent.study();

    }
}
