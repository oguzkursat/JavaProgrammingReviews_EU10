package daily_tasks.day43_Abstraction.shape;

public final class Circle extends Two_dimensional {

    private double radius;
    private final double pi = 3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new RuntimeException("Invalid radius : " + radius);
        }
        this.radius = radius;
    }

    public double getPi() {
        return pi;
    }

    public Circle(String name, double radius) {
        super(name);
        setRadius(radius);
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
    public void twoDimension() {
        System.out.println("Circle");
    }
}
