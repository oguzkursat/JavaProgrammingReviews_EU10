package day09;

import java.util.Scanner;

public class SalaryCalculaterAfterTax {
    public static void main(String[] args) {

        /*Scanner input = new Scanner(System.in);

        System.out.print("Enter salary = ");
        double salary = input.nextDouble();
        double taxRate = 0 ;
        double tax = 0 ;

        System.out.print("Married or not (Y/N) = ");
        String isMarried = input.nextLine();*/

        //boolean isMarried = true ;

        int salary = 150000;
        boolean isMarried = false;
        double taxRate=0 ; //temporary
        double tax = 0; //temporary

        if (salary >= 130000) {
            taxRate = 0.35;
        }else if ( salary >= 100000 && salary <130000) {
            taxRate = 0.20;
        }else if ( salary >= 80000 && salary <100000) {
            taxRate = 0.25;
        }else if (  salary <80000 ) {
                    taxRate = 0.20;
        }else {
            System.err.println("Invalid entrance.");
        }
        if(isMarried){
            taxRate -= 0.05;
        }
        tax = salary * taxRate;
        salary -= tax;
        System.out.println(tax);
        System.out.println(salary);

        //input.close();

    }
}
