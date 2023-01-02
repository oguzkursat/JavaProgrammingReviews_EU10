package daily_tasks.day21;

public class Day21_Task_6_NumberOfAppearencesSomeString {
    public static void main(String[] args) {
        String str[] = {"I", "love", "java", "and", "python", "But", "java", "is",
                "better", "then", "python", "Long", "live", "java"};
        int count = 0;
        for (String elements : str) {
            if (elements.equals("java") || elements.equals("python")) {
                count++;
            }
        }
        System.out.println(count);

    }
}
