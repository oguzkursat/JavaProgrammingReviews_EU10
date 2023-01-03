package daily_tasks.day44_Abstraction.car;

public class Bmw extends Car{

    public Bmw(String make, String model, int year, double price, String color) {
        super("BMW", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getYear() + " " +getMake() + " " + getModel() + " starts with start button.");
    }

    @Override
    public void drive() {
        System.out.println(getYear() + " " +getMake() + " " + getModel() + " is driven fast.");
    }



}
