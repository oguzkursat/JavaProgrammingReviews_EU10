package day33_Statics;

public class Circle {
    public double radius,diameter;
    public static double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
        this.diameter = 2*radius;
    }
    public double calcArea(){
        double area = pi * radius * radius;
        return area;
    }
    public double calcPerimeter(){
        double perimeter = 2 * pi * radius;
        return perimeter;
    }
    public void printPi(){
        System.out.println("Pi value is : " + pi);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", pi=" + pi +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}

class CircleObject{
    public static void main(String[] args) {
        Circle c1=new Circle(2.5);
        System.out.println(c1);
    }
}