package kendi_çalışmalarım.animal_task;

public class FriendlyAnimal extends Animal {

    public boolean isWild, isFriendly, isPlayable;

    public FriendlyAnimal(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color);
        this.isWild = isWild;
        this.isFriendly = isFriendly;
        this.isPlayable = isPlayable;
    }

    public void play() {
        System.out.println(getName() + "is playing");
    }

    public void pet() {
        System.out.println(getName() + "is petting");
    }

    @Override
    public String toString() {
        return "FriendlyAnimal{" +
                super.toString()+
                ", isWild=" + isWild +
                ", isFriendly=" + isFriendly +
                ", isPlayable=" + isPlayable +
                '}';


        /*"FriendlyAnimal{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                "isWild=" + isWild +
                ", isFriendly=" + isFriendly +
                ", isPlayable=" + isPlayable +
                '}';*/
    }
}
