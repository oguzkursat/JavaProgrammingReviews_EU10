package week12;

public class HouseItems {
    public String name, color;
    public int amount;

    public HouseItems(String name, String color, int amount) {
        this.name = name;
        this.color = color;
        this.amount = amount;
    }

    public String toString() {
        return "HouseItems{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", amount=" + amount +
                '}';
    }


}

class HouseItemsObject {
    public static void main(String[] args) {
        HouseItems item1 = new HouseItems("table", "brown", 1);
        System.out.println(item1);
    }
}
