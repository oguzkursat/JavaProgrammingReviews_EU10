package day33_Statics;

public class Dog {

    public String name,breed, size;
    public char gender;
    public int age;
    public String color;

    public static int numberOfLegs = 4;
    public static int numberOfEyes = 2;
    public static int numberOfWings = 0;
    public static boolean isFriendly = true;

    public Dog(String name, String breed, String size, char gender, int age, String color) {
        this.name=name;
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.age = age;
        this.color = color;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }
    public void play(){
        System.out.println(name + " is playing");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}

class DogObject{

    public static void main(String[] args) {

        Dog dog1 = new Dog("Lucy","Husky","Middle",'M',3,"Brown");
        System.out.println(dog1);


    }
}

/*
instance: breed, size, gender, age, color
	            	statics: numberOfLegs, numberOfEyes, numberOfWings, isFriendly
 */