package kendi_çalışmalarım;

import java.util.*;

public class LearnToOS {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String mac = "MacOS";
        String lenova = "Windows";
        String iPhone = "IOS";
        String samsung = "Android";

        System.out.println("Mac      ->   " + mac);
        System.out.println("Lenova   ->   " + lenova);
        System.out.println("Iphone   ->   " + iPhone);
        System.out.println("Samsung  ->   " + samsung);

        System.out.print("\n" + "input  : ");
        String system = input.nextLine();

        //String input = mac ;

        if ( system.equals("Mac") ) {
            System.out.println("output : " + mac);
        }else if ( system.equals("Lenova") ) {
            System.out.println("output : " + lenova);
        }else if ( system.equals("Iphone") ) {
            System.out.println("output : " + iPhone);
        }else if ( system.equals("Samsung") ) {
            System.out.println("output : " + samsung);
        }else {
            System.err.println("\n"+"Invalid. Please try again.");
        }

        input.close();

    }

}
