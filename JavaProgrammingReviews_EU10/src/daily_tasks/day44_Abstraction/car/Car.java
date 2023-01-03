package daily_tasks.day44_Abstraction.car;

public abstract class Car {

    private final String make;
    private final String model;
    private final int year;
    private double price;
    private String color;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new RuntimeException("Invalid price : " + price);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(String make, String model, int year, double price, String color) {

        if(make.isEmpty() || make == null){
            throw new RuntimeException("Invalid make : " + make);
        }
        this.make = make;

        if(model.isEmpty() || model == null){
            throw new RuntimeException("Invalid model : " + model);
        }
        this.model = model;

        if (year <= 1886) {
            throw new RuntimeException("Invalid year : " + year);
        }
        this.year = year;

        setPrice(price);
        setColor(color);
    }

    public abstract void start();

    public abstract void drive();

    public void stop(){
        System.out.println(year + " " + make + " " + model + " is stopped.");
    }

    public String toString() {
        return getClass().getSimpleName() +"{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
