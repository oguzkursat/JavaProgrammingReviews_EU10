package daily_tasks.day13;
import java.util.*;

public class Day13_Task1_4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter users:");
        String user1=input.nextLine();
        String user2=input.nextLine();

        System.out.println(user1.substring(0,1).toUpperCase()+"."+user2.substring(0,1).toUpperCase());


    }
}