package daily_tasks.day39.zoo_task;

public class Bear extends WildAnimal {
    public Bear(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " is hunting bear food.");
    }
}
