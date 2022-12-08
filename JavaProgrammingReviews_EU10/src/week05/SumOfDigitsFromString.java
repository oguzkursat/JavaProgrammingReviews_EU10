package week05;

import java.util.Scanner;

public class SumOfDigitsFromString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String str = input.next();

        int sum=0;

        for(int i=0 ; i<str.length() ; i++){

            if (str.charAt(i)>='0'&&str.charAt(i)<='9') {
                for(int x=48; x<58; x++) {
                    if(str.charAt(i)==x) {
                        sum += (x - 48);
                    }
                }

            }

        }

        System.out.println("Sum :"+sum);

        input.close();

    }
}