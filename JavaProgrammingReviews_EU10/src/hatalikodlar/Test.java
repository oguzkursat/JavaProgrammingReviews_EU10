package hatalikodlar;

public class Test {
    public Test(){
        System.out.print("C ");
    }

    public static void main(String[] args) {
        B obj = new B();
    }
}
class A{
    public A(){
        System.out.print("A ");
    }
}
class B extends A{
    public B(){
        System.out.print("B ");
    }
}