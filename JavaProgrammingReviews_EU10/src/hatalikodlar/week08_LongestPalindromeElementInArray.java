package hatalikodlar;

public class week08_LongestPalindromeElementInArray {
    public static void main(String[] args) {

        String[] str = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna" };
        String result = "";
        String dummy = "";
        int max = 0;
        for (int i = 0; i < str.length; i++) {
            result = "";
            for (int j = str[i].length() - 1; j >= 0; j--) {
                result += str[i].charAt(j);
            }
            if (result.equals(str[i]) && str[i].length() > max) {
                max = str[i].length();
                dummy = result;
            }
        }
        System.out.println(dummy + " and it's lenght is " + max);
    }
}