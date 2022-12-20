package day35_Encapsulation;

public class Pizza {
    private String size;
    private int numberOfCheeseTopping;
    private int numberOfPepperoniTopping;

    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        if (size.equals("small") || size.equals("medium") || size.equals("large")) {
            this.size = size;
        }
    }
    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }
    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if (numberOfCheeseTopping > 0) {
            if (size.equals("small") && numberOfCheeseTopping <= 3) {
                this.numberOfCheeseTopping = numberOfCheeseTopping;
            }
            if (size.equals("medium") && numberOfCheeseTopping <= 4) {
                this.numberOfCheeseTopping = numberOfCheeseTopping;
            }
            if (size.equals("large") && numberOfCheeseTopping <= 5) {
                this.numberOfCheeseTopping = numberOfCheeseTopping;
            }
        }
    }
    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }
    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        if (numberOfPepperoniTopping > 0) {
            if (size.equals("small") && numberOfPepperoniTopping <= 4) {
                this.numberOfPepperoniTopping = numberOfPepperoniTopping;
            }
            if (size.equals("medium") && numberOfPepperoniTopping <= 5) {
                this.numberOfPepperoniTopping = numberOfPepperoniTopping;
            }
            if (size.equals("large") && numberOfPepperoniTopping <= 6) {
                this.numberOfPepperoniTopping = numberOfPepperoniTopping;
            }
        }
    }

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public double calcCost() {
        double cost = 0;
        if (size.equals("small")) {
            cost += 10;
        } else if (size.equals("medium")) {
            cost += 12;
        } else if (size.equals("large")) {
            cost += 14;
        }

        cost += (2 * numberOfCheeseTopping) + (2 * numberOfPepperoniTopping);

        return cost;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", cost=" + calcCost() +
                '}';
    }
}

class PizzaObject {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("medium", 15, 4);
        System.out.println(pizza1);
    }
}