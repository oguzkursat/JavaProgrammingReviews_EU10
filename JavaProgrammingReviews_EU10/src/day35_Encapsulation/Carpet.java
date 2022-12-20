package day35_Encapsulation;

public class Carpet {

    private int width, length;
    private double unitPrice;
    private boolean isPersian;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        }
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length > 0) {
            this.length = length;
        }
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice > 0) {
            this.unitPrice = unitPrice;
        }
    }

    public boolean isPersian() {
        return isPersian;
    }

    public void setPersian(boolean persian) {
        isPersian = persian;
    }

    public double calcCost() {
        double cost = (width * length) * unitPrice;
        if (isPersian){
            cost+=200;
        }
        return cost;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", cost=" + calcCost() +
                '}';
    }
}

class CarpetObject{
    public static void main(String[] args) {
        Carpet c1 = new Carpet();
        c1.setWidth(4);
        c1.setLength(5);
        c1.setUnitPrice(10);
        c1.setPersian(true);
        System.out.println(c1);
    }
}