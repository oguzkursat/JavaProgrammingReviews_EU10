package hatalikodlar;
import java.util.Scanner;
public class Java {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = "";
        do {

                System.out.println("Enter the radius of circle:  ");
                double radius = scan.nextDouble();
                if (radius <= 0) {
                    System.out.println("Invalid Entry for the radius of the circle");
                    System.exit(0);
                }

                double PI = 3.14;

                double diameter = 2 * radius;
                double perimeter = 2 * radius * PI;
                double circleArea = radius * radius * PI;

                System.out.println("Diameter= " + diameter);
                System.out.println("Perimeter =  " + perimeter);
                System.out.println("Area =  " + circleArea);

                System.out.println("would you like to calculate another circle");
                answer = scan.next().toLowerCase();
                scan.nextLine();
                while(!(answer.equals("yes")||answer.equals("no"))){
                    System.out.println("Invalid entry");
                    answer = scan.next().toLowerCase();
                    scan.nextLine();
                }
        }
        while (!(answer.equals("no")));
            System.out.println("Thank you for using Cydeo Circle Calculator APP");
            System.exit(0);


    }
}
