package enums.seasons;

public enum Season {
    SPRING,    SUMMER,    FALL,    WINTER;
    
    public static Season getSeasonByTemperature(int temp){
        if (temp < 5) return Season.WINTER;
        else if( temp < 10) return FALL;
        else if (temp < 20) return SPRING;
        else if(temp < 50) return SUMMER;
        else return null;
    }
    
}
