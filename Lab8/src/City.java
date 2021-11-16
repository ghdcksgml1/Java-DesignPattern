import java.util.Comparator;

public class City {
    private String city; // 도시를 저장하는 멤버변수
    private String country; // 나라를 저장하는 멤버변수

    // constructor
    public City(String city, String country){
        this.city = city;
        this.country = country;
    }

    // getter & setter
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

    // toString
    @Override
    public String toString() {
        return "City{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
