package enums;

public enum Planets {
    MERCURY("Mercury", 88, 58),
    VENUS("Venus", 225, 108),
    EARTH("Earth", 365, 149),
    MARS("Mars", 87, 228),
    JUPITER("Jupiter", 4333, 778),
    SATURN("Saturn", 10759, 1400),
    URANUS("Uranus", 30687, 2900),
    NEPTUNE("Neptune", 60200, 4500);
    
    private String name;
    private int yearLength;
    private String distanceFromSun;
    
    private Planets(String name, int yearLength, long distanceFromSun){
        this.name = name;
        this.yearLength = yearLength;
        this.distanceFromSun = (distanceFromSun*1000000) + " kilometers";
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getYearLength () {
        return yearLength;
    }
    
    public String getDistanceFromSun () {
        return distanceFromSun;
    }
}
