package hatalikodlar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] names = {"Anna", "Nancy", "Sarah"};
        int scores[] = {90, 75, 80};
        char grades[] = new char[scores.length];

        for (int i = 0; i < names.length; i++) {
            grades[ i] =(scores[i] >= 90 && scores[i] <= 100) ? 'A' : (scores[i] >= 80) ? 'B' : 'C';
        }


    }
}
