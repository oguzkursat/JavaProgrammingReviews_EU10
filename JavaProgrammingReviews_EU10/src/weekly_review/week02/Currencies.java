package weekly_review.week02;

import java.util.Scanner;

public class Currencies {

    public static void main (String [] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your money for currencies = ");

        double dollar = input.nextDouble();

        double TL = dollar * 18.20;
        double euro = dollar * 0.86;
        double JPY = dollar * 114.14;
        double pound = dollar * 0.73;
        double CAD = dollar * 1.24;

        System.out.println("dollar = " + dollar);
        System.out.println("TL = " + TL);
        System.out.println("euro = " + euro);
        System.out.println("JPY = " + JPY);
        System.out.println("pound = " + pound);
        System.out.println("CAD = " + CAD);

        input.close();

    }
}
