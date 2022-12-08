package day11;

import java.util.Scanner;

public class ElevatorWithIfAndSwitchStatements {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter floor number = ");
        int floorNumber = input.nextInt();

        String companies = "";
        String result = "";

        if (floorNumber>0 && floorNumber<4){
            switch (floorNumber){
                case 1:
                    companies = "Lobby, Verizon, Starbucks";
                    result = "Floor " + floorNumber + " selected. Companies: " + companies;
                    break;
                case 2:
                    companies = "Cybertek, NASA, Intelsat";
                    result = "Floor " + floorNumber + " selected. Companies: " + companies;
                    break;
                default:
                    companies = "Lyft, BofA, Stake house";
                    result = "Floor " + floorNumber + " selected. Companies: " + companies;
                    break;
            }
        }else{
            result = "Invalid number - 6";
        }

        System.out.println(result);

        input.close();

    }
}
