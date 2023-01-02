package daily_tasks.day17;

import java.util.Scanner;

public class Day17_Task_6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = input.nextLine();

        double price=0;

        System.out.print("Enter your gender : ");
        String gender = input.next();
        while(!(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female"))){
            System.out.println("Invalid gender");
            System.out.print("Enter your gender : ");
            gender = input.next();
        }

        System.out.println("Are you married?");
        String  isMarried = input.next();
        while (!(isMarried.equalsIgnoreCase("no") || isMarried.equalsIgnoreCase("yes"))){
            System.out.println("Invalid information");
            System.out.println("Are you married?");
            isMarried = input.next();
        }

        System.out.print("Enter your age : ");
        int age = input.nextInt();
        while (age<=0 || age>120){
            System.out.println("Invalid age");
            System.out.print("Enter your age : ");
            age = input.nextInt();
        }

        System.out.println("How many miles do you drive in a day?");
        int miles = input.nextInt();
        while (miles<=5){
            System.out.println("Invalid miles");
            System.out.println("How many miles do you drive in a day?");
            miles = input.nextInt();
        }

        System.out.println("Do you want full coverage or liability insurance?");
        String insurance = input.next();
        input.nextLine();
        while (!(insurance.equalsIgnoreCase("yes") || insurance.equalsIgnoreCase("no"))){
            System.out.println("Invalid information");
            System.out.println("Do you want full coverage or liability insurance?");
            insurance = input.next();
            input.nextLine();
        }
        if(insurance.equalsIgnoreCase("yes")){
            System.out.println("Which type?(full coverage/liability)");
            String type = input.nextLine();
            if(type.equalsIgnoreCase("liability")){
                if(age<25){
                    price+=90;
                }else{
                    price+=50;
                }
                if(miles<=10){
                    price+=10;
                } else if (miles<=50) {
                    price+=30;
                }else{
                    price+=50;
                }
            }
            if(type.equalsIgnoreCase("full overage")){
                if(age<25){
                    price+=160;
                }else{
                    price+=120;
                }
                if(miles<=10){
                    price+=20;
                } else if (miles<=50) {
                    price+=40;
                }else{
                    price+=70;
                }
            }
        }

        System.out.println("Do you have any accidents or claims in past 5 years?");
        String accident = input.next();
        while (!(accident.equalsIgnoreCase("yes") || accident.equalsIgnoreCase("no"))){
            System.out.println("Invalid information");
            System.out.println("Do you have any accidents or claims in past 5 years?");
            accident = input.next();
        }

        System.out.println("Do you have any anti-theft device in your car?");
        String device = input.next();
        while (!(device.equalsIgnoreCase("yes") || device.equalsIgnoreCase("no"))){
            System.out.println("Invalid information");
            System.out.println("Do you have any anti-theft device in your car?");
            device = input.next();
        }

        if(device.equalsIgnoreCase("yes")){
            price*=0.95;
        }

        if(accident.equalsIgnoreCase("yes")){
            price*=1.15;
        }else{
            price*=0.90;
        }

        if(isMarried.equalsIgnoreCase("yes")){
            price*=0.95;
        }

        System.out.println("price : $" + price);

        input.close();

    }
}