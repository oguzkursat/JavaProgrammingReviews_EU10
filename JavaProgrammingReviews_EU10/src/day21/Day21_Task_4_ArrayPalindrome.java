package day21;

public class Day21_Task_4_ArrayPalindrome {
    public static void main(String[] args) {
        String str[] = {"anna", "level", "radar", "Java"};
        int count = 0;
        String result = "";
        for (int i = 0; i < str.length; i++) {
            result = "";
            for (int j = str[i].length() - 1; j >= 0; j--) {
                result += str[i].charAt(j);
            }
            if (result.equals(str[i])) {
                count++;
            }
        }

        System.out.println(count);

    }
}