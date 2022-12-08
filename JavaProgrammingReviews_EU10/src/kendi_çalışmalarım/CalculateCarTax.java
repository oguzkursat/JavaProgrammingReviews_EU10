package kendi_çalışmalarım;

import java.util.Scanner;

public class CalculateCarTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter car price = ");
        int carPrice = input.nextInt();
        double carTax;

        if(carPrice>=20000 && carPrice<40000){
            carTax = carPrice*0.2;
            System.out.print("Car taxes is = " + carTax);
        }else if(carPrice>=40000 && carPrice<60000){
            carTax = carPrice*0.3;
            System.out.print("Car taxes is = " + carTax);
        }else if(carPrice>=60000 && carPrice<80000){
            carTax = carPrice*0.4;
            System.out.print("Car taxes is = " + carTax);
        }

        input.close();

        /*if the price between $20000 and $39999 taxRate=0.2
        if the price between $40000 and $59999 taxRate=0.3
        if the price between $60000 and $80000 taxRate=0.4
        */





    }
}
