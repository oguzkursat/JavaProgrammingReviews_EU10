package hatalikodlar;

import java.util.Arrays;

public class Ball {

    static String author;
    static {
        author = "Stephen";
    }

    public static void main(String[] args) {

        Ball ball1 = new Ball();
        ball1.author = "King";
        Ball ball2 = new Ball();
        System.out.println(ball1.author);
        System.out.println(ball2.author);

        ball2.author = "Emanuel";
        System.out.println(ball1.author);
        System.out.println(ball2.author);


    }






        /*int [] arr = {1,3,5,9,7,6,-8};
        int min = minNum(arr);
    }

    private static int minNum(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }*/
}
