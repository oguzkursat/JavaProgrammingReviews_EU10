package daily_tasks.day45_Abstraction.shape;

public class Cylinder extends Shape implements Volume {

    private double radius;

    private double height;

    public static final double pi = 3.14;

    public Cylinder(String name, double radius, double height) {
        super("Cylinder");
        setRadius(radius);
        setHeight(height);
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new RuntimeException("Invalid height : " + radius);
        }
        this.height = height;
    }

    @Override
    public double area() {
        double area = ((radius * radius * pi) * 2) + (perimeter() * height);
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter = 2 * radius * pi;
        return perimeter;

    }

    @Override
    public double volume() {
        double volume = area() * height;
        return volume;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                super.toString() +
                ", radius = " + radius +
                ", height = " + height +
                '}';
    }
}
