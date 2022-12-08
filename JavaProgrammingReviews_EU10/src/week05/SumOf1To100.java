package week05;

public class SumOf1To100 {
    public static void main(String[] args) {

        int sum = 0;

        for (int num=0; num<101 ; num++)
            sum+=num;
        System.out.println(sum);
    }
}
