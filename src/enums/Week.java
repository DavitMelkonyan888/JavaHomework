package enums;

public enum Week {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    
    /**
     * This function returns the number of the day
     * @return
     */
    public int getNumber(){
        return this.ordinal()+1;
    }
}
