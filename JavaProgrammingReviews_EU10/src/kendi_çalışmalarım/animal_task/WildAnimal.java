package kendi_çalışmalarım.animal_task;

public class WildAnimal extends Animal {

    public boolean isWild, isFriendly, isPlayable;

    public WildAnimal(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color);
        this.isWild = isWild;
        this.isFriendly = isFriendly;
        this.isPlayable = isPlayable;
    }

    public void hunt() {
        System.out.println(getName() + " is hunting");
    }



}
