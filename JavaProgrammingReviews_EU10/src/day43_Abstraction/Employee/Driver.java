package day43_Abstraction.Employee;

public final class Driver extends Employee{

    public Driver(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " sleeps 10 hours");
    }

    @Override
    public void sleep() {
        System.out.println(getId() + getName() + " is sleeping");
    }
}
