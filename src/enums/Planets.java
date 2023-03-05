package enums;

public enum Planets {
    MERCURY("Mercury", 88, 58, 0.33),
    VENUS("Venus", 225, 108, 4.87),
    EARTH("Earth", 365, 149, 5.97),
    MARS("Mars", 87, 228, 0.642),
    JUPITER("Jupiter", 4333, 778, 1898),
    SATURN("Saturn", 10759, 1400, 568),
    URANUS("Uranus", 30687, 2900, 86.8),
    NEPTUNE("Neptune", 60200, 4500, 102);
    
    private String name;
    private int yearLength;
    private String distanceFromSun;
    
    private String mass;
    
    private Planets(String name, int yearLength, long distanceFromSun, double mass){
        this.name = name;
        this.yearLength = yearLength;
        this.distanceFromSun = (distanceFromSun*1000000) + " kilometers";
        this.mass = (mass*Math.pow(10, 24)) + "kg";
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
    
    public String getMass () {
        return mass;
    }
}
