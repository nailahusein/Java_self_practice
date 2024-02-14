package day13_practice_tasks.student_task;

public class CydeoStudent extends Student1{

    private int batchNumber, groupNumber;
    private String programmingLanguage;

    public CydeoStudent(String name, String gender, int age, String studentId, String fieldOfStudy, String schoolName, char grade, int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, gender, age, studentId, fieldOfStudy, schoolName, grade);
        setBatchNumber(batchNumber);
        setGroupNumber(groupNumber);
        setProgrammingLanguage(programmingLanguage);
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void study() {
        System.out.println(getName() + " is studying at " + getSchoolName() + ", batch number " + getBatchNumber() + ", in group " + getGroupNumber() );
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "batchNumber = " + batchNumber +
                ", groupNumber = " + groupNumber +
                ", programmingLanguage = '" + programmingLanguage + '\'' +
                '}';
    }
}
