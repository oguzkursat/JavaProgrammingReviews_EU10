package daily_tasks.day16;

import java.util.Scanner;

public class Day16_Task_5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter sentence:");
        String sentence = input.nextLine();

        int numDog=0;
        int numCat=0;

        //  Cat Cat Dog Dog CAt,CAT, caT

        for (int i = 0; i <= sentence.length()-3; i++) {
            if(sentence.substring(i,i+3).equalsIgnoreCase("dog")){
                numDog += 1;
            }
            if(sentence.substring(i,i+3).equalsIgnoreCase("cat")) {
                numCat += 1;
            }
        }
        if(numDog==numCat){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

    }
}
