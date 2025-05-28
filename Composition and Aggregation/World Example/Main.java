package saad;

public class Main {
    public static void main(String[] args) {
        Continent count1 = new Continent("Asia");
        Continent count2 = new Continent("Europe");
        Continent count3 = new Continent("Africa");
        Continent count4 = new Continent("North America");

        count1.addCountry(new Country("Pakistan"));
        count1.addCountry(new Country("Palestine"));

        count2.addCountry(new Country("UK"));
        count2.addCountry(new Country("Turkey"));

        count3.addCountry(new Country("Nigeria"));
        count3.addCountry(new Country("South Africa"));

        count4.addCountry(new Country("Canada"));
        count4.addCountry(new Country("Mexico"));

        count1.addCitytoContinent(new City("Hyderabad", 20000), "Pakistan");
        count1.addCitytoContinent(new City("Damascus", 15000), "Palestine");

        count2.addCitytoContinent(new City("Istanbul", 10000), "Turkey");
        count2.addCitytoContinent(new City("London", 30000), "UK");

        count4.addCitytoContinent(new City("Quebec", 40000), "Canada");
        count4.addCitytoContinent(new City("Mexico City", 50000), "Mexico");

        count1.display();
    }
}
