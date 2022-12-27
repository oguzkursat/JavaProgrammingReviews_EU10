package day43_Abstraction.Car;

import java.util.SortedMap;

public class Honda extends Car {

    public Honda(String brand, String model, String color, int year, double price) {
        super("Honda", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Twist the key to ignition");
    }

}
