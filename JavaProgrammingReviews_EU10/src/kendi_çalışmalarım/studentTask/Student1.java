package kendi_çalışmalarım.studentTask;

public class Student1 extends Person1 {
    private int studentId;
    private String fieldOfStudy;
    private char grade;
    private String schoolName;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if (fieldOfStudy == null) {
            System.err.println("Field of study can not be null");
            System.exit(1);
        }
        if (fieldOfStudy.isEmpty()) {
            System.err.println("Field of study can not be empty");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (!(grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F')) {
            System.err.println("Invalid grade");
            System.exit(1);
        }
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        if (schoolName == null) {
            System.err.println("School name can not be null");
            System.exit(1);
        }
        if (schoolName.isEmpty()) {
            System.err.println("School name can not be empty");
            System.exit(1);
        }
        this.schoolName = schoolName;
    }

    public Student1(String name, int age, char gender, int studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public void study() {
        System.out.println(getName() + " is studying");
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "studentId=" + studentId +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
