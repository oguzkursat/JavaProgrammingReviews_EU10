package hatalikodlar;

public class Phone {

    static  int number;

    public Phone(String str){
        this(str.length()); //
    }
    public Phone(int num){ // number = 13
        this();   //
        number += num;  //
    }

    public Phone(){
        number += 1;
    }
}
class CallPhones{
    public static void main(String[] args) {

        new Phone("iphone");  //number = 7
        new Phone();  //number = 8
        new Phone(4);// number = 13
        System.out.println(Phone.number);
    }
}
