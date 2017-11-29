package lab6;

public class Adress {
    private String country;
    private String region;
    private String city;
    private String street;
    private int numberOfHouse;
    private int flat;

    public Adress(String country, String region, String city, String street, int numberOfHouse, int flat) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.numberOfHouse = numberOfHouse;
        this.flat = flat;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumberOfHouse() {
        return numberOfHouse;
    }

    public void setNumberOfHouse(int numberOfHouse) {
        this.numberOfHouse = numberOfHouse;
    }

    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }

    @Override
    public String toString() {
        return  "country: " + country +
                " region: " + region +
                " city: " + city +
                " street: " + street +
                " numberOfHouse: " + numberOfHouse +
                " flat: " + flat;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Adress){
            Adress adress = (Adress) obj;
            if(adress.getCity().equals(city) && adress.getCountry().equals(country) && adress.getRegion().equals(region) &&
                    adress.getStreet().equals(street) && adress.getNumberOfHouse() == numberOfHouse && adress.getFlat() == flat){
                return true;
            }
        }
        return false;
    }
}
