package enums.coffee;

public enum CoffeeSize {
    SMALL,
    MEDIUM,
    LARGE;
    
    public void print(){
        System.out.println(this + " " + this.ordinal());
    }
}
