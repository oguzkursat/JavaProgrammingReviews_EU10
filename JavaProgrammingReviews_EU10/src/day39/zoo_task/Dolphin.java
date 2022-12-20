package day39.zoo_task;

public class Dolphin extends Animal {

    public Dolphin(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void swim(){
        System.out.println(getName()+" is swimming");
    }

    @Override
    public void eat() {
        super.eat();
    }
}
