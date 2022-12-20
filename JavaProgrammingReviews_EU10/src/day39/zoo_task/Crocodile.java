package day39.zoo_task;

import day39.zoo_task.WildAnimal;

public class Crocodile extends WildAnimal {
    public Crocodile(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+"is hunting crocodile food");
    }
}
