package daily_tasks.day20;

public class Day20_Task_7_Common_Elements_From_Different_Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        String result = "";

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    result += arr1[i] + " ";
                }
            }
        }
        result=result.trim();
        System.out.println(result);


    }
}
