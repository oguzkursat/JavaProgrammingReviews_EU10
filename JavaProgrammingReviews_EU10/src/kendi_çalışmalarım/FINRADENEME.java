package kendi_çalışmalarım;

import java.util.Scanner;

public class FINRADENEME {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.print("Enter number = ");
        int number= input.nextInt();

        String result=null;

        if (number%3==0 && number%5!=0){
            result="FIN";
        } else if (number%5==0 && number%3!=0 ) {
            result="RA";
        }else if( number%3==0 && number%5==0 ){
            result="FINRA";
        }else {
            result="NUMBER IS NOT DIVISIBLE BY 3 OR/AND 5.";
        }
        System.out.println(result);

        input.close();

    }
}
