package day09;


public class AgeGroups {
    public static void main(String[] args) {

        byte age = 5;

        if (age >= 1 && age <= 2) {
            System.out.println(age + " years old is infant.");
        } else if (age <= 5) {
            System.out.println(age + " years old is toddler.");
        } else if (age <= 9) {
            System.out.println(age + " years old is kid.");
        } else if (age <= 12) {
            System.out.println(age + " years old is pre-teen.");
        } else if (age <= 17) {
            System.out.println(age + " years old is teenager.");
        } else if (age <= 20) {
            System.out.println(age + " years old is young adult.");
        } else if (age <= 39) {
            System.out.println(age + " years old is adult.");
        } else if (age <= 49) {
            System.out.println(age + " years old is young middle-aged adult.");
        } else if (age <= 54) {
            System.out.println(age + " years old is middle-aged adult.");
        } else if (age <= 64) {
            System.out.println(age + " years old is very young senior citizen.");
        } else if (age <= 74) {
            System.out.println(age + " years old is young senior citizen.");
        } else if (age <= 84) {
            System.out.println(age + " years old is senior citizen.");
        } else if (age >= 85) {
            System.out.println(age + " years old is old senior citizen");
        } else {
            System.out.println("Invalid age.");
        }


    }
}
