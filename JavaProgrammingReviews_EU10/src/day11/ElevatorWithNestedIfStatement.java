package day11;

import java.util.Scanner;

public class ElevatorWithNestedIfStatement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter floor number = ");
        int floorNumber = input.nextInt();

        String companies = "";
        String result = "";

        if (floorNumber>0 && floorNumber<4){
            if (floorNumber==1){
                companies = "Lobby, Verizon, Starbucks";
                result = "Floor " + floorNumber + " selected.  Companies: " + companies;
            }else if (floorNumber==2){
                companies = "Cybertek, NASA, Intelsat";
                result = "Floor " + floorNumber + " selected.  Companies: " + companies;
            }
            else{
                companies = "Lyft, BofA, Stake house";
                result = "Floor " + floorNumber + " selected.  Companies: " + companies;
            }
        }else{
            result = "Invalid floor - 6";
        }

        System.out.println(result);

        input.close();


    }
}
