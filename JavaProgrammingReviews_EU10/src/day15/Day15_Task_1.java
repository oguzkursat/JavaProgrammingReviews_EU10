package day15;

public class Day15_Task_1 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i < 101 ; i++){

            if( i % 2 == 0){
                // 2,4,6,8,....

                sum +=i;

                // Addition single operator

            }
        }

        System.out.println("sum = " + sum);
    }
}
