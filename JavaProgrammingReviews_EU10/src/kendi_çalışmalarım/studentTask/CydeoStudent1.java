package kendi_çalışmalarım.studentTask;

public class CydeoStudent1 extends Student1{

    private int batchNumber, groupNumber;
    private String programmingLanguage;

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if (batchNumber<=0){
            System.err.println("Batch number can not be negative or zero");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if (groupNumber<=0){
            System.err.println("Group number can not be negative or zero");
            System.exit(1);
        }
        this.groupNumber = groupNumber;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if (programmingLanguage==null){
            System.err.println("Programming language can not be null");
            System.exit(1);
        }
        if (programmingLanguage.isEmpty()){
            System.err.println("Programming language can not be empty");
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }

    public CydeoStudent1(String name, int age, char gender, int studentId, String fieldOfStudy, char grade, String schoolName, int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
        setBatchNumber(batchNumber);
        setGroupNumber(groupNumber);
        setProgrammingLanguage(programmingLanguage);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" "+getProgrammingLanguage()+" is eating");
    }

    @Override
    public void drink() {
        System.out.println(getName()+" "+getProgrammingLanguage()+" is eating");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" "+getProgrammingLanguage()+" is eating");
    }

    @Override
    public String toString() {
        return "CydeoStudent1{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "studentId=" + getStudentId() +
                ", fieldOfStudy='" + getFieldOfStudy() + '\'' +
                ", grade=" + getGrade() +
                ", schoolName='" + getSchoolName() + '\'' +
                "batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }


}
