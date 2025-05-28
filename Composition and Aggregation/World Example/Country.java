package saad;

import java.util.ArrayList;

public class Country {
    String cName;
    double population;
    Continent locatedIn;
    ArrayList<City> cities = new ArrayList<>();

    Country(String cName) {
        this.cName = cName;
    }

    String getCountryName() {
        return cName;
    }

    void addCities(City c) {
        cities.add(c);
        c.locatedIn = this;
    }

    void calcPop() {
        population = 0;
        for (int i = 0; i < cities.size(); i++) {
            population += cities.get(i).population;
        }
    }

    void display() {
        System.out.println("Country: " + cName + " | Population: " + population);
        for (int i = 0; i < cities.size(); i++) {
            System.out.println("\tCity: " + cities.get(i).cityName + "\tPopulation: " + cities.get(i).population);
        }
    }

    public String toString() {
        return "Country Name: " + cName + "\tPopulation: " + population + "\nCities\n" + cities;
    }
}
