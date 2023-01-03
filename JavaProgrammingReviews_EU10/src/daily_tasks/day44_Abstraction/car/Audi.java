package daily_tasks.day44_Abstraction.car;

public class Audi extends Car implements Autopark{

    public Audi(String make, String model, int year, double price, String color) {
        super("Audi", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getYear() + " " +getMake() + " " + getModel() + " starts with starts button.");
    }

    @Override
    public void drive() {
        System.out.println(getYear() + " " +getMake() + " " + getModel() + " is driven comfortly.");
    }

    @Override
    public void autoPark() {
        System.out.println(getYear() + " " +getMake() + " " + getModel() + " parks with using autopark function.");
    }
}
