package daily_tasks.day45_Abstraction.shape;

public class Square extends Shape{

    private double side;


    public Square(String name, double side) {
        super("Square");
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side <= 0){
            throw new RuntimeException("Invalid side : " + side);
        }
        this.side = side;
    }

    @Override
    public double area() {
        double area = side * side;
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter = 4 * side;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Square{" +
                super.toString() +
                ", side = " + side +
                '}';
    }
}
