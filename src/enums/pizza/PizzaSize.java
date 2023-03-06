package enums.pizza;

public enum PizzaSize {
    SMALL(4), MEDIUM(6), LARGE(9);
    
    protected double cost;
    
    PizzaSize (double cost) {
        this.cost = cost;
    }
    
    public double getCost () {
        return cost;
    }
}