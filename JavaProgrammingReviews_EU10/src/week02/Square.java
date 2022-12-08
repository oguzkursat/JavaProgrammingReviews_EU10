package week02;

import java.util.Scanner;

public class Square {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter side data :");
        double sideData =input.nextDouble();

        double area = sideData * sideData;
        double perimeter = sideData * 4;

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);

        input.close();

    }

}
