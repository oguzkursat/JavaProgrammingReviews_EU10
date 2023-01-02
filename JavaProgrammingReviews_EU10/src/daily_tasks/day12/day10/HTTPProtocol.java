package daily_tasks.day12.day10;

import java.util.Scanner;

public class HTTPProtocol {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.print("Enter protocole status code number = ");
        int number = input.nextInt();

        String meaning =  (number==200)?"OK":(number==201)?"Created":
                (number==202)? "Accepted":(number==301)?"Moved Permanantly":
                (number==303)?"See Other":(number==304)?"Not Modified":
                (number==307)?"Temporary Redirected":(number==400)? "Bad Request":
                (number==401)? "Unauthorized":(number==403)?"Forbidden":
                (number==404)? "Not Found":(number==410)?"Gone":
                (number==500)?"Internal Server Error":(number==503)?"Service Unavailable":
                "Invalid status code number";
        System.out.println(meaning);

        input.close();

    }
}
