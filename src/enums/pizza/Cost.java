package enums.pizza;

public class Cost {
    private Pizza pizza;
    private double cost;
    
    public Cost (Pizza pizza) {
        this.pizza = pizza;
        count();
    }
    
    private void count(){
        this.cost = 0;
        cost += this.pizza.getPizzaSize().getCost();
        cost += this.pizza.getPizzaTopings().getCost();
    }
    
    public double getCost () {
        return cost;
    }
}
