package day16;

import java.util.Scanner;

public class Recording_Day16_DigitsLettersSpecialCharacters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter String:");
        String str = input.nextLine();

        String digits="";
        String letters="";
        String specialChacters="";

        for (int i = 0; i < str.length(); i++) {
            char ch =str.charAt(i);

            if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
                letters += ch;
            } else if (ch>='0'&&ch<='9') {
                digits += ch;
            }else{
                specialChacters += ch;
            }
        }

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(specialChacters);


    }
}
