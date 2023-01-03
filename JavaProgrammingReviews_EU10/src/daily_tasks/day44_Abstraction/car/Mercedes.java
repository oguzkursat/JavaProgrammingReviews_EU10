package daily_tasks.day44_Abstraction.car;

public class Mercedes extends Car implements Autopark{
    public Mercedes(String make, String model, int year, double price, String color) {
        super("Mercedes", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getYear() + " " +getMake() + " " + getModel() + " starts with voice control.");
    }

    @Override
    public void drive() {
        System.out.println(getYear() + " " +getMake() + " " + getModel() + " is driven safely.");
    }

    @Override
    public void autoPark() {
        System.out.println(getYear() + " " +getMake() + " " + getModel() + " parks with autopark function.");
    }





}
