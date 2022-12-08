package kendi_çalışmalarım;

import java.util.Scanner;

public class Replit_ComputerBuilderWithSwitchCase {
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
        String cpuType=input.next();

        switch (cpuType) {
            case "i3":
                totalPrice += 150;
                break;
            case "i5":
                totalPrice += 250;
                break;
            case "i7":
                totalPrice += 350;
                break;
        }

        System.out.println("Select RAM size:");
        int ramSize=input.nextInt();

        if (ramSize%4==0){
            totalPrice+=(ramSize/4)*50;
        }

        System.out.println("Select storage type:");
        String storageType=input.next();
        System.out.println("Select storage size:");
        int storageSize=input.nextInt();

        switch (storageType) {
            case "HDD":
                totalPrice+=(storageSize/500)*50;
                break;
            case "SSD":
                totalPrice+=(storageSize/500)*100;
                break;
        }

        System.out.println("Select screen resolution:");
        String screenResolution=input.next();

        switch (screenResolution) {
            case "FULLHD":
                totalPrice+=100;
                break;
            case "4K":
                totalPrice+=200;
                break;
        }

        System.out.println("Final price is: $" + totalPrice);


    }
}
