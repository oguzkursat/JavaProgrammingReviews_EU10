package kendi_çalışmalarım;

public class Address {
    private String street, city, state, country;
    private int zipCode;

    public Address(String street, String city, String state, String country, int zipCode) {
        setStreet(street);
        setCity(city);
        setState(state);
        setCountry(country);
        setZipCode(zipCode);
    }

    public Address() {

    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        if (street.isEmpty() || street.length() > 50) {
            System.err.println("ERROR : Invalid Street");
        } else {
            this.street = street;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        String zip = "" + zipCode;
        if (zip.length() != 5) {
            System.err.println();
        } else {
            this.zipCode = zipCode;
        }
    }


}
