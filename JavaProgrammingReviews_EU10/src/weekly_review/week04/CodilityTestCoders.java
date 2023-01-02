package weekly_review.week04;

import java.util.Scanner;

public class CodilityTestCoders {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        String result= "";

        if (number>0){
            if (number%2==0) {
                result = "Codility";
            }
            if (number%3==0) {
                result += "Test";
            }if (number%5==0){
                result +="Coders";
            }else {
                result="Your number is not divisible by 2 or 3 or 5";
            }

        }else {
            System.err.println("Your number is not Positive number");
        }
        System.out.println(result);
        input.close();
    }
}
