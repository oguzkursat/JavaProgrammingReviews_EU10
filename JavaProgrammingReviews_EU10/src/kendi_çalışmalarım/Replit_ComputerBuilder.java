package kendi_çalışmalarım;

import java.util.*;

public class Replit_ComputerBuilder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalPrice = 0;

        System.out.println("Select screen size:");
        double screenSize=input.nextDouble();

        if(screenSize==13.3) {
            totalPrice += 200;
        } else if (screenSize==15.0) {
            totalPrice += 300;
        } else if (screenSize==17.3) {
            totalPrice += 400;
        }


        System.out.println("Select CPU type:");
        String cpuType=input.next().toLowerCase();

        if(cpuType.equals("i3")) {
            totalPrice += 150;
        }
        if(cpuType.equals("i5")) {
            totalPrice += 250;
        }
        if(cpuType.equals("i7")){
            totalPrice+=350;
        }


        System.out.println("Select RAM size:");
        int ramSize=input.nextInt();

        if (ramSize%4==0){
            totalPrice+=(ramSize/4)*50;
        }


        System.out.println("Select storage type:");
        String storageType=input.next().toUpperCase();
        System.out.println("Select storage size:");
        int storageSize=input.nextInt();
        if(storageType.equals("HDD")){
            totalPrice+=(storageSize/500)*50;
        }
        if(storageType.equals("SSD")){
            totalPrice+=(storageSize/500)*100;
        }


        System.out.println("Select screen resolution:");
        String screenResolution=input.next().toUpperCase();

        if(screenResolution.equals("FULLHD")){
            totalPrice+=100;
        }
        if(screenResolution.equals("4K")){
            totalPrice+=200;
        }


        System.out.println("Final price is: $" + totalPrice);


    }
}

