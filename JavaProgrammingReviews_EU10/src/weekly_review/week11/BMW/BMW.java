package weekly_review.week11.BMW;

import java.time.LocalDate;

public class BMW {
    public String brand,model,color;
    public double price,mileage;
    public int year;
    public LocalDate DOfB;

    public BMW(String brand, String model, String color, double price, double mileage, int year, LocalDate DOfB) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.mileage = mileage;
        this.year = year;
        this.DOfB = DOfB;
    }

    public void getBrandName(){
        System.out.println(brand + " is brand name this car");
    }

    public String toString() {
        return "BMW{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", mileage=" + mileage +
                ", year=" + year +
                ", DOfB='" + DOfB + '\'' +
                '}';
    }
}
