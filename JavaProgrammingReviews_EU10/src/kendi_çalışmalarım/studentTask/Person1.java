package kendi_çalışmalarım.studentTask;

public class Person1 {
    private String name;
    private int age;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            System.err.println("Name can not be null");
            System.exit(1);
        }
        if (name.isEmpty()) {
            System.err.println("Name can not be empty");
            System.exit(1);
        }
        char[] arr = name.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (!Character.isLetterOrDigit(arr[i]) && arr[i] != ' '){
                System.err.println("Name can not contain special character");
                System.exit(1);
            }

        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0){
            System.err.println("Age can not be negative");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender=='F'||gender=='M')){
            System.err.println("Invalid gender");
            System.exit(1);
        }
        this.gender = gender;
    }

    public Person1(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public void eat(){
        System.out.println(getName()+" is eating");
    }
    public void drink(){
        System.out.println(getName()+" is drinking");
    }
    public void sleep(){
        System.out.println(getName()+" is sleeping");
    }

    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
