package weekly_review.week07;

public class ___CountEachNameInSentence___ {
    public static void main(String[] args) {

        String str = "Adam Adam Barry Aysun Aysun";

        String print = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            int indexOfSpace = str.indexOf(" ");
            String result = str.substring(0,indexOfSpace);
            for (int j = 0; j < str.length()-indexOfSpace; j++) {
                if(str.substring(j,j+indexOfSpace).equals(result)){
                    count++;
                }
            }
            str=str.replace(result,"");
            print+=result+"-"+count;
        }



        System.out.println(print);


    }
}
