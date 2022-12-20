package kendi_çalışmalarım.animal_task;

import day39.zoo_task.Eagle;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog("Max","Husky",'M',3,"Medium","Brown",true,true,true);
        Cat cat = new Cat("Maviş","Tekir",'F',4,"Small","Black&White",false,true,true);

        Eagle eagle = new Eagle("Maviş","Tekir",'F',4,"Small","Black&White");

        dog.eat();
        dog.bark();

        cat.scratch();

        System.out.println(dog);
        System.out.println(cat);

        System.out.println(eagle);


    }
}
