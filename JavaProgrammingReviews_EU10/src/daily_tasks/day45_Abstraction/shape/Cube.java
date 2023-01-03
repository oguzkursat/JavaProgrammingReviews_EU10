package daily_tasks.day45_Abstraction.shape;

public class Cube extends Shape implements Volume {

    private double side;


    public Cube(String name, double side) {
        super("Cube");
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            throw new RuntimeException("Invalid side : " + side);
        }
        this.side = side;
    }


    @Override
    public double area() {
        double area = (side * side) * 6;
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter = (4 * side) * 6;
        return perimeter;
    }

    @Override
    public double volume() {
        double volume = side * side * side;
        return volume;
    }

    @Override
    public String toString() {
        return "Cube{" +
                super.toString() +
                ", side = " + side +
                ", volume = " + volume() +
                '}';
    }
}