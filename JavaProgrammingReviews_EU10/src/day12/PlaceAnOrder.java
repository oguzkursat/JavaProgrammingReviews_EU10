package day12;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter product name = ");
        String productName = input.nextLine();
        System.out.print("Enter the price = ");
        double price = input.nextDouble();
        System.out.print("Enter the quantity = ");
        int quantity = input.nextInt();
        System.out.print("Enter your first name = ");
        String firstName = input.next();


        System.out.println(firstName+", your order for "+quantity+" "+productName+" has been places.Your total is "+(quantity*price)+".");

        input.close();



    }
}
