package daily_tasks.day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class day28_Task_8_GivenTheFollowingArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));

        ArrayList<Integer> gradeOfA = new ArrayList<>(scores); // 90 ~ 100,
        gradeOfA.removeIf(p-> !(p>=90&&p<=100));
        System.out.println(gradeOfA.size());

        ArrayList<Integer> gradeOfB = new ArrayList<>(scores); // 80 ~ 89
        gradeOfB.removeIf(p-> !(p>=80&&p<=89));
        System.out.println(gradeOfB.size());

        ArrayList<Integer> gradeOfC = new ArrayList<>(scores); // 70 ~ 79
        gradeOfC.removeIf(p-> !(p>=70&&p<=79));
        System.out.println(gradeOfC.size());

        ArrayList<Integer> gradeOfD = new ArrayList<>(scores); // 60 ~ 69
        gradeOfD.removeIf(p-> !(p>=60&&p<=69));
        System.out.println(gradeOfD.size());

        ArrayList<Integer> gradeOfF = new ArrayList<>(scores); // 0 ~ 59
        gradeOfF.removeIf(p-> !(p>=0&&p<=59));
        //2nd way
        //gradeOfF.removeAll(gradeOfA);
        //gradeOfF.removeAll(gradeOfB);
        //gradeOfF.removeAll(gradeOfC);
        //gradeOfF.removeAll(gradeOfD);
        System.out.println(gradeOfF.size());

    }
}
