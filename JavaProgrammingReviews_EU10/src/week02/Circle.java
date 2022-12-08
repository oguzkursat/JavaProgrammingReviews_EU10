package week02;

import java.util.Scanner;

public class Circle {

    public static void main (String [] args){

        Scanner radius = new Scanner(System.in);

        System.out.print("Enter a radius = ");

        double radiuss = radius.nextDouble();


        double PI = 3.14;
        double diameter = radiuss *2;
        double area = radiuss * radiuss * PI;
        double perimeter = diameter * PI;

        System.out.println("radius = " + radiuss);
        System.out.println("diameter = " + diameter);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

        radius.close();

    }

}
