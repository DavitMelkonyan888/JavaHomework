package enums.pizza;

public class Pizza {
    private PizzaTopings pizzaTopings;
    private PizzaSize pizzaSize;
    
    public Pizza (PizzaTopings pizzaTopings, PizzaSize pizzaSize) {
        this.pizzaTopings = pizzaTopings;
        this.pizzaSize = pizzaSize;
    }
    
    public PizzaTopings getPizzaTopings () {
        return pizzaTopings;
    }
    
    public PizzaSize getPizzaSize () {
        return pizzaSize;
    }
}
