package enums.day_of_the_week;

import enums.Unit;

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
    
    public static Week getDay(int number){
        if (number < 1 || number > 7) return null;
        int n = 1;
        for (Week i:Week.values()) {
            n++;
            if (n > number) {
                return i;
            }
        }
        return null;
    }
    
    public String week(){
        if (this.ordinal()<5) return "Today is " + this + " Weekday";
        else return "Today is " + this + " Weekend";
    }
    
}
