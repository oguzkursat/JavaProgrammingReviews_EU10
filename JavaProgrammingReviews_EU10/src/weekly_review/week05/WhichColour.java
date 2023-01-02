package weekly_review.week05;

public class WhichColour {
    public static void main(String[] args) {
        String str = "bluexx";

        if(str.startsWith("red")){
            System.out.println("red");
        } else if (str.startsWith("blue")) {
            System.out.println("blue");
        } else {
            System.out.println("");
        }


    }
}
