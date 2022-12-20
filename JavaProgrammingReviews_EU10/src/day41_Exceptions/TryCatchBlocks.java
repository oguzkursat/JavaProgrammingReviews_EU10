package day41_Exceptions;

public class TryCatchBlocks {
    public static void main(String[] args) {

        System.out.println("Test started");

        try {

            System.out.println(9/0);

            System.out.println("Try block");

        }catch (ArithmeticException e){

            System.out.println("Catch block");

            System.out.println("Arithmetic Exception was occured");

        }


        System.out.println("Test completed");



    }
}
