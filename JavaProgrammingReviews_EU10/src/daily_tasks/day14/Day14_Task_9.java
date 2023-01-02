package daily_tasks.day14;

import java.util.Scanner;

public class Day14_Task_9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter e-mail address : ");
        String email = input.next();
        input.nextLine();

        if (email.contains("_")){
            int underscore = email.indexOf("_");
            int at = email.indexOf("@");
            int dot = email.indexOf(".");

            String firstName = email.substring(0,underscore);
            String firstName2=firstName.substring(0,1).toUpperCase();
            firstName=firstName.substring(1).toLowerCase();

            String lastName = email.substring(underscore+1, at);
            String lastName2 = lastName.substring(0,1).toUpperCase();
            lastName = lastName.substring(1).toLowerCase();

            String domain = email.substring(at+1,dot);

            System.out.println("First name : "+firstName2+firstName);
            System.out.println("Last name  : "+lastName2+lastName);
            System.out.println("Domain     : "+domain);

        }

    }
}
