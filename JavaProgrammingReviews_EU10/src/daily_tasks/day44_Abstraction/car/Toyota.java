package daily_tasks.day44_Abstraction.car;

public class Toyota extends Car{

    public Toyota(String make, String model, int year, double price, String color) {
        super("Toyota", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getYear() + " " +getMake() + " " + getModel() + " starts with key.");
    }

    @Override
    public void drive() {
        System.out.println(getYear() + " " +getMake() + " " + getModel() + " is driven normally.");
    }

}
