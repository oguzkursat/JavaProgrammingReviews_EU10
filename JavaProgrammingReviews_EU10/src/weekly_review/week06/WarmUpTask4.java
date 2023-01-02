package weekly_review.week06;

import java.util.Scanner;

public class WarmUpTask4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter string:");
        String str = input.nextLine();

        /*int count=0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==' '){
                System.out.println(str.substring(count,i));
                count=i;
            }

        }



        System.out.println(str.substring(count));*/

        /*String temp = "";

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!=' '){
                temp+=str.charAt(i);
            }
            if(str.charAt(i)==' '){
                System.out.println(temp);
                temp="";
            }
        }

        System.out.println(temp);

        input.close();*/

        System.out.println(str.replace(" ","\n"));

    }
}
