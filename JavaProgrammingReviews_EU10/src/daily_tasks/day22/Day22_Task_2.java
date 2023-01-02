package daily_tasks.day22;

public class Day22_Task_2 {
    public static void main(String[] args) {

        String[][] items = { {"Apple", "Banana", "Grape", "Avocado"},
                             {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                             {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"} };
        for (String[] arr:items) {
            for (String elements:arr) {
                System.out.print(elements+"\t");
            }
            System.out.println();
        }

        System.out.println("-------------------------------------------------------------------");

        for (int i = 0; i < items.length; i++) {//outer loop for single dimensions
            for (int j = items[i].length-1 ; j >=0 ; j--) {//inner loop for getting elements
                System.out.print(items[i][j]+"\t");
            }//inner loop closing
            System.out.println();
        }//outer loop closing

        System.out.println("-------------------------------------------------------------------");

        for (int i = items.length-1; i >=0; i--) {
            for (int j = 0 ; j <items[i].length ; j++) {
                System.out.print(items[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
