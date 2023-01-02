package daily_tasks.day33_Statics;

public class Car {
    public String make;
    public String model;
    public String color;
    public int year;
    public double price;

    public static int numberOfWheels = 4;
    public static boolean hasBattery = false;
    public static boolean hasSeats = true;

    public Car(String make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    public void drive(){
        System.out.println(model+" is driven");
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}

class CarObject{
    public static void main(String[] args) {

        Car car1 = new Car("Czechia","Skoda","White",2020,15000);

        System.out.println(car1);

        car1.drive();


    }
}
