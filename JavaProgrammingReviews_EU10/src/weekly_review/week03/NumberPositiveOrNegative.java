package weekly_review.week03;

public class NumberPositiveOrNegative {
    public static void main(String[] args) {

        int number = -3;
        String result = "";

        if(number>0){
            result = "positive";
        }else if(number<0){
            result = "negative";
        }else {
            result = "zero";
        }

        System.out.println(result);



    }
}
