package daily_tasks.day35_Encapsulation;

public class Square {
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side <= 0) {
            this.side = side;
        }
    }

    public Square(int side) {
        this.side = side;
    }

    public int calcArea() {
        int area = side * side;
        return area;
    }

    public int calcPerimeter() {
        int perimeter = 4 * side;
        return perimeter;
    }

    public String toString() {
        return "Square{" +
                "side=" + side +
                ", Area=" + calcArea() +
                ", Perimeter=" + calcPerimeter() +
                '}';
    }
}

class SquareObject{
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println(square);
    }
}
