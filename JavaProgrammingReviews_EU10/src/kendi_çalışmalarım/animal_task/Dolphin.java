package kendi_çalışmalarım.animal_task;

public class Dolphin extends FriendlyAnimal {

    public Dolphin(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating dolphin food");
    }

    public void swim(){
        System.out.println(getName()+" is swimming");
    }
}
