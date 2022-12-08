package kendi_çalışmalarım;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age = ");
        int age = input.nextInt();
        System.out.print("Enter your gender = ");
        String gender = input.next();
        input.nextLine();
        System.out.print("Enter your full name = ");
        String fullName = input.nextLine();
        System.out.print("Enter your phone number = ");
        long phoneNumber = input.nextLong();
        input.nextLine();
        System.out.print("Enter your zip code = ");
        int zipCode = input.nextInt();
        input.nextLine();
        System.out.print("Enter your school name = ");
        String schoolName = input.nextLine();
        System.out.print("Enter your city name = ");
        String cityName = input.nextLine();
        System.out.print("Enter your building number = ");
        int buildingNumber = input.nextInt();
        input.nextLine();
        System.out.print("Enter your street name = ");
        String streetName = input.nextLine();


        System.out.println("Full Name : " + fullName);
        System.out.println("Age : " + age);
        System.out.println("Gender : " + gender);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("Address :\n\t\t"+buildingNumber+" "+streetName+"\n\t\t"+cityName+", "+zipCode);
        System.out.println("School Name : " + schoolName);

        input.close();

    /*  full name
        age
        gender
        phone number
        address:
                building number  street
                city,state zip code
        school name
     */



    }
}
