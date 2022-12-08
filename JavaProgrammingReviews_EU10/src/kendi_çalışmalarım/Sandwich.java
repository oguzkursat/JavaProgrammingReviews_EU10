package kendi_çalışmalarım;
import java.util.Scanner;
public class Sandwich {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        //WRITE YOUR CODE BELOW

        int i = str.indexOf("bread");
        int lastI = str.lastIndexOf("bread");

        if(i!=lastI) {
            System.out.println(str.substring(i + 5, lastI));
       }
        else{
            System.out.println("nothing");
        }
    }
}
