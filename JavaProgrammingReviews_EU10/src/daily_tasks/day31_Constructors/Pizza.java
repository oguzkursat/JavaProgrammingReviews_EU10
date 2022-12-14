package daily_tasks.day31_Constructors;

public class Pizza {

    public char size;
    public int numberOfCheeseTopping, numberOfPepperoniTopping;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseToppingi=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", totalPrice= $" + calcCost() +
                '}';
    }

    public double calcCost() {
        double startingPrice = (size == 'S') ? 10 : (size == 'M') ? 12 : 14;

        double totalPrice = startingPrice + (numberOfCheeseTopping + numberOfPepperoniTopping) * 2;

        return totalPrice;
    }

}
