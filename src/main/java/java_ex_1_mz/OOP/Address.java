package java_ex_1_mz.OOP;


public class Address {

    private String street;
    private int homeNo;
    private int flatNo;
    private String city;
    private String country;

    public Address(String street, int homeNo, int flatNo, String city, String country) {
        this.street = street;
        this.homeNo = homeNo;
        this.flatNo = flatNo;
        this.city = city;
        this.country = country;
    }

    public String toString(){
        return "Adres " + " ulica: " + street + ", nr domu: " + homeNo + ", nr piętra: " +
                flatNo + ", misto: " + city + ", kraj: " + country;
    }

    public Address() {
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(int flatNo) {
        this.flatNo = flatNo;
    }

    public int getHomeNo() {
        return homeNo;
    }

    public void setHomeNo(int homeNo) {
        this.homeNo = homeNo;
    }



}
