package hatalikodlar;

public class Test {
    int count;

    public void m(){
        count++;
    }
    public void m (int n){
        count*=n;
    }
    public static void main(String[] args) {

        Test obj = new Test();
        obj.m(5);
        obj.m();
        obj.count += 10;
        obj.m(2);
        System.out.println(obj.count);

    }
}
