package day07;

public class LeapYear {
    public static void main(String[] args) {

        int year = 2020;
        boolean isLeapYear=false;
        if(year%4==0){
            isLeapYear=true;
        }

        System.out.println(year+" is leap year: "+isLeapYear);


    }
}
