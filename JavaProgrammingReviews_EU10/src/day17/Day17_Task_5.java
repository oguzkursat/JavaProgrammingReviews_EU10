package day17;

import java.util.Scanner;

public class Day17_Task_5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Do you want a room?");
        String answer = input.next();

        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
            System.out.println("Invalid answer. re enter answer again");
            System.out.println("Do you want a room?");
            answer = input.next();
            input.nextLine();
        }
        if (answer.equalsIgnoreCase("no")) {
            System.out.println("Have a nice day.");
        } else {
            System.out.println("Which type of do you want?");
            String roomType = input.nextLine();

            int price = 0;

            while (!(roomType.equalsIgnoreCase("King Bed") || roomType.equalsIgnoreCase("Queen Bed") || roomType.equalsIgnoreCase("Single Bed"))) {
                System.out.println("Invalid answer. re enter answer again");
                System.out.println("Which type of do you want?");
                roomType = input.next();
            }
            if (roomType.equalsIgnoreCase("King Bed")) {
                price = 120;
            } else if (roomType.equalsIgnoreCase("Queen Bed")) {
                price = 100;
            } else {
                price = 100;
            }

            System.out.println("Room Type : " + roomType);
            System.out.println("Price     : $" + price );
        }

        input.close();

    }
}

