package weekly_review.week02;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome the shipping address system. Please follow the rules.");

        System.out.print("Enter shipping name = ");
        String name = input.nextLine();

        System.out.print("Enter building name = ");
        String buildingName = input.nextLine();

        System.out.print("Enter street name = ");
        String streetName = input.nextLine();

        System.out.print("Enter city = ");
        String city = input.nextLine();

        System.out.print("Enter state = ");
        String state = input.nextLine();

        System.out.print("Enter zip code = ");
        String zipCode = input.nextLine();

        System.out.println("\t\t\t" + "SHIPPING ADDRESS : " + "\n\t\t\t" + name + "\n\t\t\t" + buildingName + " " + streetName + "\n\t\t\t" + city + ", " + state + " " + zipCode);

        input.close();

    }
}
