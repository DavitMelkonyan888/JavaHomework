package enums.pizza;

public enum PizzaTopings {
    ONE(2.5), TWO(2.8), THREE(3.5), FOUR(3.9), FIVE(4.5);
    
    protected double cost;
    
    PizzaTopings (double cost) {
        this.cost = cost;
    }
    
    public double getCost () {
        return cost;
    }
}
