package week12;

public class MyCalculatorV1 {
    public int add(int n1, int n2){
        int result = n1 + n2;
        return result;
    }
    public int minus(int n1, int n2){
        int result = n1 - n2;
        return result;
    }
    public int multiply(int n1, int n2){
        int result = n1 * n2;
        return result;
    }
    public int divide(int n1, int n2){
        int result = n1 / n2;
        return result;
    }
}

class MyCalculatorV1Test{
    public static void main(String[] args) {
        MyCalculatorV1 a = new MyCalculatorV1();
        System.out.println(a.add(3,5));
        System.out.println(a.minus(3,5));
        System.out.println(a.multiply(3,5));
        System.out.println(a.divide(3,5));
    }

}
