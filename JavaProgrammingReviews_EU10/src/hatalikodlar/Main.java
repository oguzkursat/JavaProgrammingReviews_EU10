package hatalikodlar;


import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int array [] = {10,3,5,3,1,3};
        int [] arrayEndsZero = new int[array.length];

        for (int i = 0, j = 0, k = arrayEndsZero.length-1; i < array.length; i++) {
            if(array[i]!=3){
                arrayEndsZero[j++]=array[i];
            }else{
                arrayEndsZero[k--]=array[i];
            }

        }

        System.out.println(Arrays.toString(arrayEndsZero));


    }

}