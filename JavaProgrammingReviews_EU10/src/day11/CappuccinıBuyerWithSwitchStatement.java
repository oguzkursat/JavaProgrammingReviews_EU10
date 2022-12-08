package day11;

import java.util.Scanner;

public class CappuccinıBuyerWithSwitchStatement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your size of cappuccino (tall/grande/venti) = ");
        String size= input.nextLine();

        double price = 0;
        int calories = 0;
        String result ="";

        switch (size) {
            case "tall":
                price = 3.69;
                calories = 90;
                result = "Your choice is " + size + "\n\tprice is " + price + "\n\tcalories are " + calories;
                break;
            case "grande":
                price = 3.69;
                calories = 90;
                result = "Your choice is " + size + "\n\tprice is " + price + "\n\tcalories are " + calories;
                break;
            case "venti":
                price = 3.69;
                calories = 90;
                result = "Your choice is " + size + "\n\tprice is " + price + "\n\tcalories are " + calories;
                break;
            default:
                result = "Invalid Size";
                break;
        }


        System.out.println(result);


        input.close();




    }
}
