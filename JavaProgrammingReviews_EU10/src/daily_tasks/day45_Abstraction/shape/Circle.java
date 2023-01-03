package daily_tasks.day45_Abstraction.shape;

public class Circle extends Shape {

    private double radius;
    public final static double pi = 3.14;

    public Circle(String name, double radius) {
        super("Circle");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new RuntimeException("Invalid radius : " + radius);
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        double area = radius * radius * pi;
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter = 2 * radius * pi;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                super.toString() +
                ", radius = " + radius +
                '}';
    }
}
