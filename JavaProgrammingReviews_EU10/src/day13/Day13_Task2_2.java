package day13;

import java.util.Scanner;

public class Day13_Task2_2 {
    public static void main(String[] args) {

        double tip = 0;
        double totalPay = 0;
        double tipPerPerson = 0;
        double payPerPerson = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Split or No split (Yes or No)?");
        String yesOrNo = input.nextLine().toLowerCase();
        System.out.println("Enter the number of people:");
        int numberOfPeople = input.nextInt();
        System.out.println("Enter the check amount:");
        double amount = input.nextDouble();
        input.nextLine();

        if (yesOrNo.equals("yes")) {
            if (numberOfPeople > 0) {
                if (amount > 0) {
                    System.out.println("How was the service quality?\n(Excellent/Great/Good/Fair/Poor)");
                    String quality = input.nextLine().toLowerCase();

                    switch (quality) {
                        case "excellent":
                            tip = amount * 0.25;
                            break;
                        case "great":
                            tip = amount * 0.20;
                            break;
                        case "good":
                            tip = amount * 0.15;
                            break;
                        case "fair":
                            tip = amount * 0.10;
                            break;
                        case "poor":
                            tip = amount * 0.05;
                            break;
                        default:
                            System.err.println("Invalid quality degree");
                            break;
                    }
                } else {
                    System.err.println("It cant be negative or zero. Enter a positive number.");
                }
                totalPay = tip + amount;
                tipPerPerson = tip / numberOfPeople;
                payPerPerson = totalPay / numberOfPeople;

                System.out.println("Number of people entered:" + numberOfPeople);
                System.out.println("Total to pay            :" + totalPay);
                System.out.println("Total tip               :" + tip);
                System.out.println("Total per person        :" + payPerPerson);
                System.out.println("Tip per person          :" + tipPerPerson);
            } else {
                System.err.println("It cant be negative or zero. Enter a positive number.");
            }
        } else if (yesOrNo.equals("no")) {
            if (numberOfPeople > 0) {
                System.out.println("Number of people entered:" + numberOfPeople);
                System.out.println("Total to pay            :" + amount);
                System.out.println("Total per person        :" + (amount / numberOfPeople));
            } else {
                System.err.println("It cant be negative or zero. Enter a positive number.");
            }
        } else {
            System.err.println("Invalid answer.");
        }

        input.close();

    }
}
