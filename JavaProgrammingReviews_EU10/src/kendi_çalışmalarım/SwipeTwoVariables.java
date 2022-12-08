package kendi_çalışmalarım;

import java.util.Scanner;

public class SwipeTwoVariables {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("ENTER NUMBER-1 = ");
        int number1 = input.nextInt();
        System.out.print("ENTER NUMBER-2 = ");
        int number2 = input.nextInt();

        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);

        int number3;

        System.out.println("Şimdi sayıların yerlerini değiştiriyoruz");

        number3 = number1;
        number1 = number2;
        number2 = number3;

        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);

        input.close();


        /*int ivar=100;
        double dvar = 123;
        float fvar =  200;
       /ivar=fvar;
        fvar=ivar;
        dvar=fvar;
        fvar= (float )dvar;

        System.out.println(dvar);
        System.out.println(fvar);
        dvar=ivar;
        ivar=dvar;*/

    }
}
