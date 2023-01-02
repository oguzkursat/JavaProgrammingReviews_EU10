package daily_tasks.day11;

import java.util.Scanner;

public class ElevatorWithSwitchStatement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter floor number = ");
        int floorNumber = input.nextInt();

        String companies = "";
        String result = "";

        switch (floorNumber){
            case 1:
                companies = "Lobby, Verizon, Starbucks";
                result = "Floor " + floorNumber + " selected. Companies: " + companies;
                break;
            case 2:
                companies = "Cybertek, NASA, Intelsat";
                result = "Floor " + floorNumber + " selected. Companies: " + companies;
                break;
            case 3:
                companies = "Lyft, BofA, Stake house";
                result = "Floor " + floorNumber + " selected. Companies: " + companies;
                break;
            default:
                result = "Invalid floor - 6";
                break;
        }

        System.out.println(result);

        input.close();

    }
}
