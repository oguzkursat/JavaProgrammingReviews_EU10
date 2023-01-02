package weekly_review.week12.statics;

public class EatCake {
    public static int totalSlices = 10;


    public void eatCake(int eatSlice) {
        totalSlices -= eatSlice;
        System.out.println("Remaining slices: " + totalSlices);
    }

}
