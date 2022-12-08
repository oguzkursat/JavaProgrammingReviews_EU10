package day22;

import java.util.Arrays;

public class Day22_Task_3 {
    public static void main(String[] args) {

        String[] batch25Group1 = {"Jilil", "Aykhan", "Irene", "Yulia", "Muhtar"};
        String[] batch25Group2 = {"Riza", "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"};
        String[] batch25Group3 = {"Fady", "Break", "Clock", "Cihad", "Muhtar"};

        String[][] batch25Groups = new String[3][];

        for (int i = 0; i < batch25Groups.length; i++) {
            batch25Groups[i]=batch25Group1;
        }


        System.out.println(Arrays.deepToString(batch25Groups));

        System.out.println("----------------------------------------------------------------");

        String[] batch24Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch24Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch24Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};
        String[] batch24Groups = new String[batch24Group1.length + batch24Group2.length + batch24Group3.length];

        for (int i = 0; i < batch24Groups.length; i++) {
            if (i < batch24Group1.length) {
                batch24Groups[i] = batch24Group1[i];
            } else if (i < (batch24Group1.length + batch24Group2.length)) {
                batch24Groups[i] = batch24Group2[i - batch24Group1.length];
            } else {
                batch24Groups[i] = batch24Group3[i - (batch24Group1.length + batch24Group2.length)];
            }
        }
        for (int i = 0; i < batch24Groups.length; i++) {
            // batch25Groups[i] = batch24Groups[i];
        }
        System.out.println(Arrays.toString(batch25Groups));

        System.out.println("----------------------------------------------------------------");


    }
}
