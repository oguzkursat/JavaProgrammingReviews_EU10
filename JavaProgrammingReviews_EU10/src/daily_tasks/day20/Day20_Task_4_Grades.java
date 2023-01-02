package daily_tasks.day20;

public class Day20_Task_4_Grades {

    public static void main(String[] args) {

        String[] names = {"Anna", "Nancy", "Sarah"};
        int[] scores = {90, 75, 80};
        char[] grades = new char[scores.length];

        for (int i = 0; i < grades.length; i++) {
            if (scores[i] > 89) {
                grades[i] = 'A';
            } else if (scores[i] > 79) {
                grades[i] = 'B';
            } else if (scores[i] > 69) {
                grades[i] = 'C';
            } else if (scores[i] > 59) {
                grades[i] = 'D';
            }else {
                grades[i] = 'F';
            }

            System.out.println(names[i]+"'s score is "+scores[i]+", and grade is "+grades[i]);
        }
    }
}
