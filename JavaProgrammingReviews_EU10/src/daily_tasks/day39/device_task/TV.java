package daily_tasks.day39.device_task;

public class TV extends Device {

    public TV(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    public void channelUp() {
        System.out.println(getModel() + " is channel up");
    }

    public void channelDown() {
        System.out.println(getModel() + "is channel down");
    }
}
