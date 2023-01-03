package daily_tasks.day44_Abstraction.car;

public class Tesla extends Car implements Autopark,AutoPilot{

    public Tesla(String make, String model, int year, double price, String color) {
        super("Tesla", model, year, price, color);
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

    @Override
    public void selfDrive() {
        System.out.println(getYear() + " " +getMake() + " " + getModel() + " has self drive function.");
    }
}
