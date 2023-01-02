package daily_tasks.day35_Encapsulation;

public class Item {
    private String name;
    private double unitPrice;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        for (int i = 0; i < name.length(); i++) {
            if (Character.isLetter(name.charAt(0)) && (Character.isAlphabetic(name.charAt(i)) || name.equals(" ")) && !name.isEmpty() && !name.isBlank()){
                this.name = name;
            }
        }
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if(unitPrice>0) {
            this.unitPrice = unitPrice;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity>0) {
            this.quantity = quantity;
        }
    }

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setQuantity(quantity);
        setUnitPrice(unitPrice);
    }

    public double calcCost(){
        double cost = unitPrice * quantity;
        return cost;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", cost=" + calcCost() +
                '}';
    }
}


class ItemObject{
    public static void main(String[] args) {
        Item item1 = new Item("toilet paper",2100,3);
        System.out.println(item1);
    }
}


/*
name can not be empty or blank
            			name can not contain any special characters other than space
            			name must start with letters
            			unit price can not be negative
            			quantity can not be negative
            			if the Item name is toilet paper (case insensitive) then the quantity can not be more than 1
 */