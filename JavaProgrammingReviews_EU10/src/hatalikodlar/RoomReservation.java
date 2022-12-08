package hatalikodlar;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String str=scanner.next();
        String  result="";
        for (int i = 0; i <str.length() ; i++) {
            int count=0;
            for (int j = 0; j <str.length() ; j++) {
                if (str.charAt(i)==str.charAt(j))
                    count++;
            }
            if (!(result.contains(str.charAt(i)+"")))
                result+=str.charAt(i)+""+count;
        } System.out.print(result);
        scanner.close();

    }
}
