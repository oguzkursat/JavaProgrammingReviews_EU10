package day43_Abstraction.Car;

public class Tesla extends Car{

    public Tesla(String brand, String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Say \"Start\"");
    }

}
