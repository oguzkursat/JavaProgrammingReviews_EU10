package kendi_çalışmalarım;

import java.util.Scanner;

public class AgeGroups {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print( "Enter age = " );
        byte age = input.nextByte();

        if ( age>=1 && age <=2){
            System.out.println(age + " years old is infant.");
        }else if ( age>=3 && age <=5){
            System.out.println(age + " years old is toddler.");
        }else if ( age>=6 && age <=9){
            System.out.println(age + " years old is kid.");
        }else if ( age>=10 && age <=12){
            System.out.println(age + " years old is pre-teen.");
        }else if ( age>=13 && age <=17){
            System.out.println(age + " years old is teenager.");
        }else if ( age>=18 && age <=20){
            System.out.println(age + " years old is young adult.");
        }else if ( age>=21 && age <=39){
            System.out.println(age + " years old is adult.");
        }else if ( age>=40 && age <=49){
            System.out.println(age + " years old is young middle-aged adult.");
        }else if ( age>=50 && age <=54){
            System.out.println(age + " years old is middle-aged adult.");
        }else if ( age>=55 && age <=64){
            System.out.println(age + " years old is very young senior citizen.");
        }else if ( age>=65 && age <=74){
            System.out.println(age + " years old is young senior citizen.");
        }else if ( age>=75 && age <=84){
            System.out.println(age + " years old is senior citizen.");
        }else if ( age>=85){
            System.out.println(age + " years old is old senior citizen");
        }else{
            System.out.println("Invalid age.");
        }

        input.close();

    }
}
