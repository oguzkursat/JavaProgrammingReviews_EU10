package day13;

import java.util.Scanner;

public class Day13_Task1_8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter username : ");
        String username = input.next();
        System.out.print("Enter password : ");
        String password = input.next();

        if(username.equals("Cydeo") && password.equals("WoodenSpoon")){
            System.out.println("Logged in.");
        }else{
            System.err.println("Incorrect username or password.");
        }

        input.close();

    }
}
