package day18;

import java.util.Scanner;

public class Day18_Task_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int price = 0;
        int totalPrice = 0;

        while (true) {

            System.out.println("Which bedroom do you want to reserve?");
            String reserve = input.nextLine();
            System.out.println("How many nights will you stay?");
            int howManyNights = input.nextInt();
            System.out.println("Would you like to reserve another room?");
            String anotherRoom = input.next().toLowerCase();
            input.nextLine();

            if (reserve.equals("king bed")) {
                price = 120 * howManyNights;
                totalPrice += price;
            } else if (reserve.equals("queen bed")) {
                price = 100 * howManyNights;
                totalPrice += price;
            } else if (reserve.equals("single bed")) {
                price = 80*howManyNights;
                totalPrice += price;
            }

            while (!(anotherRoom.equals("yes") || anotherRoom.equals("no"))) {
                System.out.println("Invalid entry, please re enter");
                anotherRoom = input.next().toLowerCase();
                input.nextLine();
            }
            if (anotherRoom.equals("no")) {
                break;
            }

        }

        System.out.println("Total price = " + totalPrice);

    }
}
