package weekly_review.week12;

public class MyCalculatorV2 {
    public int n1,n2;

    public MyCalculatorV2(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int add(){
        int result = n1 + n2;
        return result;
    }
    public int minus(){
        int result = n1 - n2;
        return result;
    }
    public int multiply(){
        int result = n1 * n2;
        return result;
    }
    public int divide(){
        int result = n1 / n2;
        return result;
    }

    public String toString() {
        return "MyCalculatorV2{" +
                "n1=" + n1 +
                ", n2=" + n2 +
                ", add()="+add()+
                ", minus()="+minus()+
                ", multiply()="+multiply()+
                ", divide()="+divide()+
                '}';
    }
}

class MyCalculatorV2Test{
    public static void main(String[] args) {
        MyCalculatorV2 b = new MyCalculatorV2(3,5);
        System.out.println(b);
    }
}
