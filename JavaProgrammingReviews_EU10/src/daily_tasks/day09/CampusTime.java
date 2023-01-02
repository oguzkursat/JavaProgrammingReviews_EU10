package daily_tasks.day09;

import java.util.Scanner;

public class CampusTime {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter time between 0-24= ");
        int time = input.nextInt();

        if ( time >=8 && time<=23) {
            System.out.println("OPEN");
        }else if ( (time <8 && time >=0 ) || ( time>23 && time<=24 ) ) {
            System.out.println("CLOSED");
        }else{
            System.err.println("Invalid time.");
        }

        input.close();

    }
}
