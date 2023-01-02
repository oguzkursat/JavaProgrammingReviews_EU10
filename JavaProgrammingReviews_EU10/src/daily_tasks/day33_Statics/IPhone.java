package daily_tasks.day33_Statics;

public class IPhone {
    public String model;
    public double price;
    public String color, size;

    public static String brand = "Apple";
    public static String OS = "IOS";
    public static String madeIn = "P.R.C.";

    public IPhone(String model, double price, String color, String size) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
    }

    public void faceTime(long phoneNumber){
        System.out.println(phoneNumber + " is Facetime call");
    }
    public void faceTime(String email){
        System.out.println(email + " is mailing");
    }
    public void call(long phoneNumber){
        System.out.println(phoneNumber + " is calling");
    }
    public void text(long phoneNumber){
        System.out.println(phoneNumber + "is texting");
    }

    public String toString() {
        return "IPhone{" +
                "model='" + model + '\'' +
                ", price=$" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}

class IPhoneObject{
    public static void main(String[] args) {
        IPhone iPhone1 = new IPhone("7",700,"White","Middle");
        System.out.println(iPhone1);
        iPhone1.call(5621433);
        iPhone1.faceTime("oguz@cydeo.com");
        iPhone1.text(546431);
        iPhone1.faceTime(56464363);
    }
}
