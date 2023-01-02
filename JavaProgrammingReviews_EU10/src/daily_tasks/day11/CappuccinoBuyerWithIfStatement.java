package daily_tasks.day11;

import java.util.Scanner;

public class CappuccinoBuyerWithIfStatement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your size of cappuccino (tall/grande/venti) = ");
        String size= input.nextLine();

        double price = 0;
        int calories = 0;
        String result = "";

        if(size.equals("tall")){
            price = 3.69;
            calories = 90;
            result="Your choice is "+size+"\n\tprice is "+price+"\n\tcalories are "+calories;
        }else if (size.equals("grande")){
            price = 3.99;
            calories = 120;
            result="Your choice is "+size+"\n\tprice is "+price+"\n\tcalories are "+calories;
        } else if (size.equals("venti")) {
            price = 4.29;
            calories = 150;
            result="Your choice is "+size+"\n\tprice is "+price+"\n\tcalories are "+calories;
        }else{
            result = "Invalid Size";
        }

        System.out.println(result);



    }
}
