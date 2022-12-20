package day39.zoo_task;

import day39.zoo_task.WildAnimal;

public class Tiger extends WildAnimal {
    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void hunt() {
        super.hunt();
    }
}
