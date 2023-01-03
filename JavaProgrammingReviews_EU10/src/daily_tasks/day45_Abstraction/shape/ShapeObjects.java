package daily_tasks.day45_Abstraction.shape;

public class ShapeObjects {
    public static void main(String[] args) {

        Circle circle = new Circle("",4);
        Square square = new Square("",5);
        Cylinder cylinder = new Cylinder("",4,8);
        Cube cube = new Cube("",3);

        System.out.println(circle);
        System.out.println(square);
        System.out.println(cylinder);
        System.out.println(cube);



    }
}
