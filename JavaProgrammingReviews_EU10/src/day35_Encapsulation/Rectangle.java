package day35_Encapsulation;

public class Rectangle {
    private int width, length;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        }
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length > 0) {
            this.length = length;
        }
    }

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int calcArea() {
        int area = width * length;
        return area;
    }

    public int calcPerimeter() {
        int perimeter = (width + length) * 2;
        return perimeter;
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}

class RectangleObject {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 5);
        System.out.println(r1);
    }
}
