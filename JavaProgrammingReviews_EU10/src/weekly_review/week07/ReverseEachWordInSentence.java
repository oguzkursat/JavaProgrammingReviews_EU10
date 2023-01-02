package weekly_review.week07;

public class ReverseEachWordInSentence {
    public static void main(String[] args) {

        String str = "Adam come here";
        str = str + " ";

        String result = "";

        for (int i = 0; i < str.length(); i++) {


            int indexOfSpace = str.indexOf(" ");
            for (int j = indexOfSpace-1; j >= 0; j--) {
                result += str.charAt(j);
            }
            result += " ";
            str = str.substring(indexOfSpace + 1);
            i = 0;
        }

        System.out.println(result);

    }
}
