package day07;

public class SwipeTwoVariables {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
