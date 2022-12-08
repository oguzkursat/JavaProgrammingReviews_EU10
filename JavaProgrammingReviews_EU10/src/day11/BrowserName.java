package day11;

import java.util.Scanner;

public class BrowserName {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter browser name(chrome/firefox/opera/safari/edge) = ");
        String browserName = input.nextLine();

        String result = "";

        switch (browserName){
            case "chrome":
                result = "Browser name is " + browserName;
                break;
            case "firefox":
                result = "Browser name is " + browserName;
                break;
            case "opera":
                result = "Browser name is " + browserName;
                break;
            case "safari":
                result = "Browser name is " + browserName;
                break;
            case "edge":
                result = "Browser name is " + browserName;
                break;
            default:
                result = "Invalid Browser";
                break;
        }

        System.out.println(result);

        input.close();




    }
}
