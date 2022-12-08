package day31_Constructors;

public class Rectangle {
    public double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        double area = length * width;
        return area;
    }

    public double calculatePerimeter() {
        double perimeter = 2*(length + width);
        return perimeter;
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + calculateArea() +
                ", perimeter=" + calculatePerimeter() +
                '}';
    }


}
