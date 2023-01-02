package daily_tasks.day16;

import java.util.Scanner;

public class Day16_Task_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int positive=0;
        int negative=0;
        int zero=0;
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5 ; i++) {

            int num = input.nextInt();

            if (num>0){
                positive +=1;
            }else if (num<0) {
                negative +=1;
            }else{
                zero+=1;
            }

        }

        System.out.println("Positive number = "+positive);
        System.out.println("Negative number = "+negative);
        System.out.println("Zero number = "+zero);

        input.close();

    }
}
