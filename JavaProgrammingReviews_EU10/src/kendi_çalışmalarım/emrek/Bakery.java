package kendi_çalışmalarım.emrek;

public class Bakery extends SuperMarketTask{

    public boolean isSliced ;

    public Bakery(String nameOfItem, int quantity, double price, int expirationYear, boolean isSliced) {
        super(nameOfItem, "Bakery", quantity, price, expirationYear);
        this.isSliced = isSliced ;
    }

    public double calcPrice() {
        if(isSliced){
            double totalPrice = quantity * price + 1 ;
            return totalPrice ;
        }
        else{
            return super.calcPrice() ;
        }
    }

}
