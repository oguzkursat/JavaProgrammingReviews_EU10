package day13;

import java.util.Scanner;

public class Day13_Task2_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Do you have a valid passport(Yes/No)?");
        String passportAnswerYesOrNo = input.next().toLowerCase();
        input.nextLine();

        System.out.println("Which country do you want to travel?");
        String countryName = input.nextLine();
        System.out.println("How many bags do you have for travel?");
        byte numberOfBags = input.nextByte();
        System.out.println("How many people do you travel with?");
        short numOfPeople = input.nextShort();
        input.nextLine();
        System.out.println("Enter the name of people who you travel with?");
        String peopleYouTravelWith = input.nextLine();

        if(passportAnswerYesOrNo.equals("yes")){
            double ticket = 1000 ;
            ticket += (numberOfBags*50);
            if(numOfPeople<=3){
                ticket -= (numOfPeople*100);
            }else if (numOfPeople>3){
                ticket -= 300;
            }else{
                System.err.println("Invalid number of people.");
            }
            System.out.println("Your ticket is booked to "+countryName+
                    ". We have charged extra for the "+numberOfBags+" bags but you are \n" +
                    "traveling with "+peopleYouTravelWith+" so we are giving a discount. Your \n" +
                    "total cost is $"+ticket);
        }else if(passportAnswerYesOrNo.equals("no")){
            double ticket = 1000 ;
            ticket += (numberOfBags*50);
            if(numOfPeople<=3){
                ticket -= (numOfPeople*100);
            }else if (numOfPeople>3){
                ticket -= 300;
            }else{
                System.err.println("Invalid number of people.");
            }
            ticket += 200 ;
            System.out.println("When did your passport expire?");
            int years = input.nextInt();
            input.nextLine();
            ticket += (years*75);
            System.out.println("Will you travel in the next year?");
            String yesOrNo = input.nextLine().toLowerCase();
            if (yesOrNo.equals("yes")){
                ticket += 100;
            } else if (yesOrNo.equals("no")) {
                ticket -= 50;
            } else {
                System.err.println("Invalid entrance.");
            }
            System.out.println("Looks like your password has been expired for "+years +
                    ", but not to worry we will get it ready for you to travel to " +
                    countryName+". Your total cost has come out to "+ticket+".");

        }else{
            System.err.println("Invalid answer.");
        }

        input.close();

    }
}
