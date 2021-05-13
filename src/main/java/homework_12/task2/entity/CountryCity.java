package homework_12.task2.entity;

public class CountryCity {

      String country;
      String town;
      String street;

      CountryCity(){

      }

    public CountryCity(String country, String town, String street) {
        this.country = country;
        this.town = town;
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "CountryCity{" +
                "country='" + country + '\'' +
                ", town='" + town + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
