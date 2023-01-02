package daily_tasks.day30_CustomClass;

public class Car {
    public String brand;
    public String model;
    public String color;
    public int year;
    public double price;

    public void setInfo( String carBrand,String carModel,String carColor,int carYear,double carPrice){
        brand=carBrand;
        model=carModel;
        color=carColor;
        year=carYear;
        price=carPrice;
    }
    public static void drive(int carYear , String carBrand){
        System.out.println(carYear + " model " + carBrand + " is ready to drive.");
    }
    public static void start(int carYear , String carBrand){
        System.out.println(carYear + " model " + carBrand + " is starting.");
    }
    public static void stop(int carYear , String carBrand){
        System.out.println(carYear + " model " + carBrand + " is stopping.");
    }

    public String toString() {
        return "Car{" +
                "brand = '" + brand + '\'' +
                ", model = '" + model + '\'' +
                ", color = '" + color + '\'' +
                ", year = " + year +
                ", price = $" + price +
                '}';
    }
}
