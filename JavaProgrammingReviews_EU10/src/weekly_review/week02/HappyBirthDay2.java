package weekly_review.week02;

import java.time.LocalDate;
import java.util.Scanner;

public class HappyBirthDay2 {


    public static void main(String[] args) {

        Scanner bD = new Scanner(System.in);
        Scanner bM = new Scanner(System.in);
        Scanner bY = new Scanner(System.in);

        System.out.print("Doğduğunuz günü 1 ile 31 arasında olacak şekilde giriniz = ");
        int day = bD.nextInt();
        System.out.print("Doğduğunuz ayı 1 ile 12 arasında olacak şekilde giriniz = ");
        int month = bM.nextInt();
        System.out.print("Doğduğunuz yılı 4 haneli olacak şekilde giriniz giriniz = ");
        int year = bY.nextInt();

        happyBirthDay(year,month,day);


    }



    public static void happyBirthDay(int year, int month, int day){
        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();

        int month2 = today.getMonthValue();
        int day2 = today.getDayOfMonth();

        if(month2 == month && day == day2){
            System.out.println("Today is your birthday!!!");
            System.out.println("   \n \t \t  \t \t    * * * * * * * * * * * * * * * * * * * * *");
            System.out.println("   \t \t  \t \t  *  * * * * * * * * * * * * * * * * * * * *  * ");
            System.out.println("  \t \t  \t \t *  *                                       *  * ");
            System.out.println(" \t \t  \t \t*  *          Happy BirthDay To You!         *  * ");
            System.out.println("  \t \t  \t \t *  *                                       *  * ");
            System.out.println("  \t \t   \t \t  *  * * * * * * * * * * * * * * * * * * * *  * ");
            System.out.println("   \t \t   \t \t    * * * * * * * * * * * * * * * * * * * * *");
            return;
        }
        System.err.println("Today is not your birthday yet");
    }


}