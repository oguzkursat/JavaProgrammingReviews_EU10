package weekly_review.week12.employee;

public class Employee {
    public String name;
    public int id;
    public char gender;

    public Employee(String name, int id, char gender) {
        this.name = name;
        this.id = id;
        this.gender = gender;
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, int id) {
        this(name);
        this.id = id;
    }
}
