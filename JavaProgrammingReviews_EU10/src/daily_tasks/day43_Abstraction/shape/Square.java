package daily_tasks.day43_Abstraction.shape;

public final class Square extends Shape{
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            throw new RuntimeException("Invalid side : " + side);
        }
        this.side = side;
    }

    public Square(String name, double side) {
        super(name);
        setSide(side);
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


}
