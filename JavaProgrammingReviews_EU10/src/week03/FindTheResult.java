package week03;

import java.util.Scanner;

public class FindTheResult {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

 /*       Create a class which is "FindTheResult" create a variable
        int a=15;
        if a is divisable by 3 add 20
        if a is divisable by 5 add 25
        if a is divisable by 15 add 50
   */
        System.out.print("Enter number = ");
        int num = input.nextInt();



        if ( num % 3 == 0 ){
            num = num + 20 ;
            System.out.println( "new number%3 = " + num );
            num = num -20;
            if ( num % 5 == 0 ){
                num = num + 25;
                System.out.println( "new number%5 = " + num );
                num = num - 25 ;
                if ( num % 15 == 0 ){
                    num = num + 50 ;
                    System.out.println( "new number%15 = " + num );
                    num = num - 50 ;
               }
            }
        }else if ( num % 5 == 0 ){
            num = num + 25;
            System.out.println( "new number%5 = " + num );
            num = num - 25 ;
            if ( num % 15 == 0 ){
                num = num + 50 ;
                System.out.println( "new number%15 = " + num );
                num = num - 50 ;
            }
        }

        input.close();


    }
}
