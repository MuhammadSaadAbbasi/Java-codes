package saad;

public class City {
    String cityName;
    double population;
    Country locatedIn;

    City(String cityName, double population) {
        this.cityName = cityName;
        this.population = population;
    }

    String getCityName() {
        return cityName;
    }

    void setCityName(String n) {
        cityName = n;
    }

    public String toString() {
        return cityName + "\t" + population + "\n";
    }
}
