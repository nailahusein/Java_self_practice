package day13_practice_tasks.student_task;

public class Student1 extends Student {

private String studentId, fieldOfStudy, schoolName;
private char grade;

    public Student1(String name, String gender, int age, String studentId, String fieldOfStudy, String schoolName, char grade) {
        super(name, gender, age);
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
        setSchoolName(schoolName);
        setGrade(grade);
    }


    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void study(){
        System.out.println(getName() + " is studying at " + getSchoolName());
    }

    @Override
    public String toString() {
        return super.toString()+"{" +
                "studentId = '" + studentId + '\'' +
                ", fieldOfStudy = '" + fieldOfStudy + '\'' +
                ", grade = " + grade +
                ", schoolName = '" + schoolName + '\'' +
                '}';
    }
}
