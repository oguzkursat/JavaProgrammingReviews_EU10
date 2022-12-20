package day39.zoo_task;

public class Dog extends Animal {

    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void bark(){
        System.out.println(getName()+" is barking");
    }

    @Override
    public void eat() {
        super.eat();
    }
}
