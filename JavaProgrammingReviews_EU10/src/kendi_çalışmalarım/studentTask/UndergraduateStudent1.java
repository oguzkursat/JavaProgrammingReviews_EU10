package kendi_çalışmalarım.studentTask;

public class UndergraduateStudent1 extends Student1 {

    public UndergraduateStudent1(String name, int age, char gender, int studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }

    @Override
    public void study() {
        System.out.println(getName() + " " + getStudentId() + " " + getSchoolName()+" is studying");
    }
}
