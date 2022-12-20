package day33_Statics;

public class CydeoStudent {
    public String name;
    public int age;
    public char gender;
    public int id;
    public char grade;
    public int batchNumber;
    public int groupNumber;

    public static String schoolName="CYDEO";
    public static String programmingLanguage="JAVA";

    public CydeoStudent(String name, int age, char gender, int id, char grade, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public void study() {
        System.out.println(name + " is studying");
    }

    public void attendClass() {
        System.out.println(name + " is attending class");
    }

    public void printSchoolName() {
        System.out.println("school name is " + schoolName);
    }

    public void printProgLanguage() {
        System.out.println("proggramming language is " + programmingLanguage);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", grade=" + grade +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}

class CydeoStudentObject {
    public static void main(String[] args) {
        CydeoStudent s1 = new CydeoStudent("Muhtar",30,'F',1234,'A',10,3);
        System.out.println(s1);
        s1.printSchoolName();
        s1.printProgLanguage();
    }
}