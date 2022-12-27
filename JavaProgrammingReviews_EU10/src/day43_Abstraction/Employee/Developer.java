package day43_Abstraction.Employee;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is testing");
    }

    @Override
    public void sleep() {
        System.out.println(getId() + getName() + " is sleeping");
    }
}
