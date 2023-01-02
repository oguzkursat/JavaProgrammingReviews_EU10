package daily_tasks.day12;

import java.util.Scanner;

public class ConvertCentsToDollars {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many cents do you have?");
        int centsDoYouHave = input.nextInt();

        int dollars = centsDoYouHave/100;
        int cents = centsDoYouHave%100;


        if(centsDoYouHave>=0){
            System.out.println(centsDoYouHave + " cents equal to: " +dollars+" dollars and "+cents+" cents");
        }else{
            System.out.println("INVALID");
        }

        input.close();


    }
}
