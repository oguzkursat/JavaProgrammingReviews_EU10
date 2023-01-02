package daily_tasks.day12.day10;

import java.util.Scanner;

public class AgeGroups {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter age = ");
        int age = input.nextInt();
        String ageGroups=null;


        if ( age>0 && age<150){
            if(age<21){
                ageGroups="Teenager";
            }else if (age>=21 && age<55){
                ageGroups="Adult";
            }else{
                ageGroups="Senior";
            }
        }
        else{
                ageGroups="INVALID";
        }

        System.out.println(age + " is a/an " + ageGroups + " age groups.");

        input.close();

    }
}
