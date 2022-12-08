package day12;

import java.util.Scanner;

public class StockMarket{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many total shares you have?");
        int totalShares = input.nextInt();

        if(totalShares>0){
            System.out.println("How much your total value in the stock market?");
            double value = input.nextDouble();
            input.nextLine();
            System.out.println("Enter the name of the company you have the most shares?");
            String nameOfTheCompany = input.nextLine();

        System.out.println("Your total stock market holding is $"+ value +" which is made up of "+totalShares+" shares. "+nameOfTheCompany+" is your company holdings");
        }

        input.close();




    }
}
