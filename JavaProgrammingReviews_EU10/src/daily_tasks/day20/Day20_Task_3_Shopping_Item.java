package daily_tasks.day20;

public class Day20_Task_3_Shopping_Item {

    public static void main(String[] args) {

        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        for (int i = 0; i < items.length; i++) {
            if (items[i] == "Gloves") {
                System.out.println(items[i]);
            }
            if (items[i] == "iPad") {
                System.out.println("iPad is contained on this shopping list");
            }
        }
        for (int j = 0; j < items.length; j++) {
            System.out.print(items[j] + " - " + prices[j] + " - " + itemIDs[j] + "\n");
        }

    }
}
