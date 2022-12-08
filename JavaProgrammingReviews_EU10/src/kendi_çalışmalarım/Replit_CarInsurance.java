package kendi_çalışmalarım;
import java.util.Scanner;

public class Replit_CarInsurance {
        public static void main(String[] args) {

            //DO NOT TOUCH FOLLOWING LINE/LINES
            System.out.println("Welcome to the Cydeo car insurance!");

            //WRITE YOUR CODE BELOW
            Scanner scan = new Scanner(System.in);

            double premium=0;
            System.out.println("Enter your full name");
            String name = scan.nextLine();
            int nameSpace=name.indexOf(" ");
            String firstName = ""+name.substring(0,1).toUpperCase()+name.substring(1,nameSpace).toLowerCase();
            String lastName = ""+name.substring(nameSpace+1,nameSpace+2).toUpperCase()+name.substring(nameSpace+2).toLowerCase();

            System.out.println("Do you have a US driver license?");
            String driverLicense = scan.nextLine();
            if(driverLicense.equalsIgnoreCase("no")){
                System.out.println("You must have a license to get insurance!");
                System.exit(0);
            }
            else if(driverLicense.equalsIgnoreCase("yes")){
                System.out.println("Enter your zip code");
                String zipCode = scan.nextLine();
                if(zipCode.equals("20910") || zipCode.equals("20740")){
                    premium += 60;
                }else if(zipCode.equals("22102") || zipCode.equals("22103")){
                    premium += 30;
                }else{
                    premium += 50;
                }
                System.out.println("Is this vehicle owned, financed, or leased?");
                String vehicleOwner = scan.nextLine();
                if (vehicleOwner.equals("owned")){
                    premium += 10;
                } else if (vehicleOwner.equals("financed")) {
                    premium += 15;
                } else if (vehicleOwner.equals("leased")) {
                    premium += 20;
                }
                System.out.println("How is this vehicle primarily used?");
                String vehicleUsedFor = scan.nextLine();
                if(vehicleUsedFor.equals("business")){
                    premium += 50;
                } else if (vehicleUsedFor.equals("pleasure")) {
                    premium += 10;
                } else if (vehicleUsedFor.equals("commuting")) {
                    premium +=20;
                    System.out.println("How many days do you commute?");
                    int dayToCommute = scan.nextInt();
                    premium += dayToCommute*5;
                }
                System.out.println("How old are you?");
                int age = scan.nextInt();
                scan.nextLine();
                if(age<16){
                    System.out.println("You can't be driving");
                    System.exit(0);
                }else if(age <20){
                    premium *= 10;
                } else if (age <25) {
                    premium *= 6;
                } else{
                    premium *= 2;
                }
                System.out.println("Have you had any accidents in the last 5 years?");
                String accident = scan.nextLine();
                if (accident.equalsIgnoreCase("yes")){
                    System.out.println("How many?");
                    int accidentNumber = scan.nextInt();
                    scan.nextLine();
                    premium += accidentNumber*10;
                }
                System.out.println("What is the highest level of education you have completed?");
                String educationLevel = scan.nextLine();
                if(educationLevel.equalsIgnoreCase("Bachelors") || educationLevel.equalsIgnoreCase("Masters")) {
                    premium *= 0.95;
                }else if(educationLevel.equalsIgnoreCase("PHD")) {
                    premium *= 0.90;
                }else if(educationLevel.equalsIgnoreCase("High School")) {
                    premium *= 0.95;
                }

                String educationLevelWithoutSpace = "";
                if(educationLevel.contains(" ")) {
                    int space = educationLevel.indexOf(" ");
                    educationLevelWithoutSpace = educationLevel.substring(0, space) + educationLevel.substring(space + 1);
                }else{
                    educationLevelWithoutSpace=educationLevel;
                }

                String referenceNumber = ""+firstName.substring(0,2) + age + lastName.substring(lastName.length()-3) + zipCode + educationLevelWithoutSpace;

                System.out.println(""+firstName+" "+lastName+", here's your quote!");
                System.out.println("This is your start premium cost: $" + premium);
                System.out.println("This is your reference number: " + referenceNumber.toUpperCase());

            }

        }
    }