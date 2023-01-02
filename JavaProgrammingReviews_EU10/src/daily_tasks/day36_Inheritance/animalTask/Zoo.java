package daily_tasks.day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog("Max","Husky",'M',2,"Small","White");
        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();
        System.out.println(dog.name);


        Cat cat = new Cat("Tarcin","British",'M',3,"Small","Brown");
        System.out.println(cat);
        cat.name="Maviş";
        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        cat.scratch();


        Tiger tiger = new Tiger("Sher Khan","Bengal",'M',4,"Large","Orange");
        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();
        tiger.hunt();
        tiger.roar();

    }
}
