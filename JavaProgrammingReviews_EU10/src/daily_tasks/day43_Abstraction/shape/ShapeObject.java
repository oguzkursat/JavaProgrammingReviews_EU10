package daily_tasks.day43_Abstraction.shape;

public class ShapeObject {
    public static void main(String[] args) {

        Circle circle = new Circle("circle1",2.4);

        System.out.println(circle);

        Rectangle rectangle = new Rectangle("rectangle1",4,5.1);

        System.out.println(rectangle);

        Square square = new Square("square1",3);

        System.out.println(square);

        Shape shape = new Circle("circle",5);
        System.out.println(shape);


    }
}
