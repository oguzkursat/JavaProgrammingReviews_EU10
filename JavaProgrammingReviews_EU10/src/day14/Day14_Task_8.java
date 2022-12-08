package day14;

import java.util.Scanner;

public class Day14_Task_8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter e-mail address : ");
        String email = input.next();
        input.nextLine();

        if (email.contains("_")){
            int underscore = email.indexOf("_");
            int at = email.indexOf("@");
            String atmail = email.substring(at,email.length());
            String firstName = email.substring(0,underscore);
            String secondName = email.substring(underscore+1, at);

            System.out.println(secondName+"_"+firstName+atmail);
        }else{
            System.out.println(email);
        }
    }
}
