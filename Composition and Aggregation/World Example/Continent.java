package saad;

import java.util.ArrayList;

public class Continent {
    String ContinentName;
    double Area;
    double population;
    ArrayList<Country> countries = new ArrayList<>();

    Continent(String ContinentName) {
        this.ContinentName = ContinentName;
    }

    void addCountry(Country c) {
        countries.add(c);
    }

    Country getCountry(String name) {
        for (Country c : countries) {
            if (name.equals(c.cName)) {
                return c;
            }
        }
        System.out.println("Country not Exist");
        return null;
    }

    void addCitytoContinent(City c, String name) {
        Country country = getCountry(name);
        if (country != null) {
            country.addCities(c);
            country.locatedIn = this;
            country.calcPop();
        }
    }

    void calcPop() {
        population = 0;
        for (int i = 0; i < countries.size(); i++) {
            population += countries.get(i).population;
        }
    }

    void display() {
        for (int i = 0; i < countries.size(); i++) {
            countries.get(i).display();
        }
    }

    public String toString() {
        return ContinentName + "\tPopulation: " + population + "\nCountries\n" + countries;
    }
}
