package kendi_çalışmalarım;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 0 to 9 for converting word = ");
        int number = input.nextInt();

        if(number == 0){
            System.out.println( "number = " + number );
            System.out.println( "output :\n\t  Zero");
        }else if(number == 1){
            System.out.println( "number = " + number );
            System.out.println( "output :\n\t  One");
        }else if(number == 2) {
            System.out.println("number = " + number);
            System.out.println("output :\n\t  Two");
        }else if(number == 3) {
            System.out.println("number = " + number);
            System.out.println("output :\n\t  Three");
        }else if(number == 4) {
            System.out.println("number = " + number);
            System.out.println("output :\n\t  Four");
        }else if(number == 5) {
            System.out.println("number = " + number);
            System.out.println("output :\n\t  Five");
        }else if(number == 6) {
            System.out.println("number = " + number);
            System.out.println("output :\n\t  Six");
        }else if(number == 7) {
            System.out.println("number = " + number);
            System.out.println("output :\n\t  Seven");
        }else if(number == 8) {
            System.out.println("number = " + number);
            System.out.println("output :\n\t  Eight");
        }else if(number == 9) {
            System.out.println("number = " + number);
            System.out.println("output :\n\t  Nine");
        }

        input.close();

    }
}
