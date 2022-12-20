package kendi_çalışmalarım.animal_task;

public class Animal {

    private String name, breed;
    private char gender;
    private int age;
    private String size, color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null){
            System.err.println("Name can not be null");
            System.exit(1);
        }if (name.isEmpty()|| name.isBlank()){
            System.err.println("Name can not be empty or blank");
            System.exit(1);
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if(breed==null){
            System.err.println("Breed can not be null");
            System.exit(1);
        }if (breed.isEmpty()|| breed.isBlank()){
            System.err.println("Breed can not be empty or blank");
            System.exit(1);
        }
        this.breed = breed;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender=='F'||gender=='M')){
            System.err.println("Invalid gender");
            System.exit(1);
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            System.err.println("Age can not be negative");
            System.exit(1);
        }
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color==null){
            System.err.println("Color can not be null");
            System.exit(1);
        }if (color.isEmpty()|| color.isBlank()){
            System.err.println("Color can not be empty or blank");
            System.exit(1);
        }
        this.color = color;
    }

    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setSize(size);
        setColor(color);
    }

    public void eat(){
        System.out.println(name+" is eating");
    }
    public void drink(){
        System.out.println(name+" is drinking");
    }
    public void sleep(){
        System.out.println(name+" is slepping");
    }
    public void move(){
        System.out.println(name+" is moving");
    }

    public String toString() {
        return
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\''                 ;
    }
}
