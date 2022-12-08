package day09;

import java.util.Scanner;

public class FINRA {
    public static void main(String[] args) {

       /* Scanner input = new Scanner(System.in);

        System.out.print("Enter number = ");
        int num = input.nextInt();*/

        int num = 24;

       // String fin = "FIN";
        //String ra = "RA";


       // boolean isMultiple3 = num % 3 == 0;
       // boolean isMultiple5 = num % 5 == 0;

        if (num % 3 == 0 &&  num % 5 != 0) {
            System.out.println("number = " + num);
            System.out.println("output:\n\t\tFIN");
        }else if (num % 5 == 0 && num % 3!=0){
            System.out.println("number = " + num);
        System.out.println("output:\n\t\t" );
        }else if (num % 3 == 0 && num % 5 == 0 ) {
            System.out.println("number = " + num);
            System.out.println("output:\n\t\t" );
        }else{
            System.err.println("THERE IS SOMETHING WRONG");
        }

       // input.close();

    }
}
