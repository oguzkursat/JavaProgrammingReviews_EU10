package hatalikodlar;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String guestsList = "";

        while(true) {
            System.out.println("Please enter the guest's name:");
            String name = input.next();
            guestsList += name;
            System.out.println("Do you want to enter another guest's name?");
            String answer = input.next();
            input.nextLine();
            while (!(answer.equals("yes")||answer.equals("no"))) {
                System.out.println("Invalid entry!!");
                System.out.println("Do you want to enter another guest's name?");
                answer = input.next();
            }
            if (answer.equals("yes")){
                guestsList+=", ";
            }
            if (answer.equals("no")){
                break;
            }
        }
        System.out.println("Guests' list: "+guestsList);


    }
}

