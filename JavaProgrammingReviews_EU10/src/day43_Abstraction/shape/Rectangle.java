package day43_Abstraction.shape;

public final class Rectangle extends Shape {

    private double width, length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new RuntimeException("Invalid width : " + width);
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (width <= 0) {
            throw new RuntimeException("Invalid length : " + length);
        }
        this.length = length;
    }

    public Rectangle(String name, double width, double length) {
        super(name);
        setWidth(width);
        setLength(length);
    }

    @Override
    public double area() {
        double area = width * length;
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter = 2 * (width + length);
        return perimeter;
    }
}
