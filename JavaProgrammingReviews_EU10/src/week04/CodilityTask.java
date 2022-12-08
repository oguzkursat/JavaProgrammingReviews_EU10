package week04;

import java.util.Scanner;

public class CodilityTask{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number = ");
        int num = input.nextInt();

        String result = "";

        if (num >0) {

            if (num % 2 == 0) {

                result = "Codility";
            }
            if (num % 3 == 0) {

                result+="Test";
            }
            if (num % 5 == 0) {

                result+="Coders";
            }
            if (!((num % 2 == 0) || (num % 3 == 0) || (num % 5 == 0))) {

                result="Number is not divisible by 2 or 3 or 5";
            }
            System.out.println(result);
        }
        else {
            System.err.println("Invalid number ");
        }


        input.close();
    }
}
