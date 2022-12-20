package day33_Statics;

public class Address {
    public String street;
    public String city, state;
    public int zipCode;

    public static String country = "USA";
    public static String planet = "World";

    public void setInfo(String street, String city, String state, int zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return street + "\n" + city + " " + state + ", " + zipCode;
    }
}

class AddressObject {
    public static void main(String[] args) {
        Address address1 = new Address();
        address1.setInfo("7925 Jones Branch Dr","McLean", "Va", 22012);
        System.out.println(address1);
    }
}
