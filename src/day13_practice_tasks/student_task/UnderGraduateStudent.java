package day13_practice_tasks.student_task;

public class UnderGraduateStudent extends Student1{


    public UnderGraduateStudent(String name, String gender, int age, String studentId, String fieldOfStudy, String schoolName, char grade) {
        super(name, gender, age, studentId, fieldOfStudy, schoolName, grade);
    }

    @Override
    public void study() {
        System.out.println(getName() + " has not graduated");
    }
}
