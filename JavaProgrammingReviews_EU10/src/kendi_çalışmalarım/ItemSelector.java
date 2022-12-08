package kendi_çalışmalarım;

import java.util.*;

class ItemSelector {
    public static void main(String[] args) {
        //WRITE YOUR CODE BELOW
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello, which item would you like?");
        String item = scan.nextLine();
        int amount= 100;

        scan.close();

        if (item=="Blanket" || item== "Charger" || item=="Hat"|| item=="HeadPhones" || item=="pants" || item== "Pillow" || item=="Socks" || item=="USB cable")
            System.out.println("Thank you for your purchase!");{
            switch (item) {

                case "Blanket":
                    System.out.println("Thank you for your purchase!\nYour current balance is: " + (amount-60) +"$");
                    break;
                case "Charger":
                    System.out.println("Thank you for your purchase!\nYour current balance is: " + (amount-5)+ "$");
                    break;
                case "Hat":
                    System.out.println("Thank you for your purchase!\nYour current balance is: " + (amount-25)+ "$");
                    break;
                case "HeadPhones" :
                    System.out.println("Thank you for your purchase!\nYour current balance is: " + (amount-30)+ "$");
                    break;
                case "Pants" :
                    System.out.println("Thank you for your purchase!\nYour current balance is: " + (amount-50)+"$");
                    break;
                case "Pillow":
                    System.out.println("Thank you for your purchase!\nYour current balance is: " + (amount-40)+"$");
                    break;

                case "Socks":
                    System.out.println("Thank you for your purchase!\nYour current balance is: " + (amount-5)+"$");
                    break;
                case "USB cable":
                    System.out.println("Thank you for your purchase!\nYour current balance is: " + (amount-10)+"$");
                    break;
                case "Laptop":
                    System.out.println("Sorry, not enough funds on your gift card");
                    break;
                case "Smartphone":
                    System.out.println("Sorry, not enough funds on your gift card");
                    break;

                default:
                    System.out.println("Sorry, that is an invalid item");
                    break;

            }if (item=="Laptop" || item== "Smartphone") {
                System.out.println("Sorry, not enough funds on your gift card");
            }
        }
    }
}