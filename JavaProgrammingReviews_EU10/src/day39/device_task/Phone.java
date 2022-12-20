package day39.device_task;

public class Phone extends Device {

    public Phone(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    public void call(long phoneNum) {
        System.out.println(phoneNum + " is calling");
    }

    public void text(long phoneNum) {
        System.out.println(phoneNum + " is texting");
    }
}
