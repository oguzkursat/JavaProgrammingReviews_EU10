package daily_tasks.day15;

public class Day15_Task_2 {
    public static void main(String[] args) {

            int sum = 0;

            for (int num=0; num<101 ; num++)
                if(num%2!=0){
                    sum+=num;
                }
            System.out.println(sum);



    }
}
