package homework3;

public class City {
    String name;
    int population;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public static void main(String[] args) {
        City yerevan = new City("Yerevan", 1068000);
        City moscow = new City("Moscow", 13010112);
        City newYork = new City("New York", 8537673);
        City paris = new City("Paris", 2165423);
    }
}
