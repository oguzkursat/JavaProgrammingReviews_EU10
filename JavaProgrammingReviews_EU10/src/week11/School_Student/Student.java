package week11.School_Student;

public class Student {
    public String name;
    public char gender;
    public String dateOfBirth;
    public int age,studentID;
    public char grade;

    public Student(String name, char gender, String dateOfBirth, int age, int studentID, char grade) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.studentID = studentID;
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", age=" + age +
                ", studentID=" + studentID +
                ", grade=" + grade +
                '}';
    }
}
