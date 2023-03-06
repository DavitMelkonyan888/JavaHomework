package enums.pizza;

import java.util.Scanner;

public class Main {
    
    private static PizzaSize getSize(){
        String str;
        Scanner scStr = new Scanner(System.in);
        System.out.print("What size pizza would you like? (small, medium, large) -> ");
        str = scStr.nextLine();
        switch(str) {
            case "small":
                return PizzaSize.SMALL;
            case "medium":
                return PizzaSize.MEDIUM;
            case "large":
                return PizzaSize.LARGE;
            default:
                System.out.println("Wrong input please try again.");
                return getSize();
        }
    }
    
    private static PizzaTopings getTop(){
        int top;
        Scanner scNum = new Scanner(System.in);
        System.out.print("How many toppings would you like? (1-5)  -> ");
        top = scNum.nextInt();
        switch(top) {
            case 1:
                return PizzaTopings.ONE;
            case 2:
                return PizzaTopings.TWO;
            case 3:
                return PizzaTopings.THREE;
            case 4:
                return PizzaTopings.FOUR;
            case 5:
                return PizzaTopings.FIVE;
            default:
                System.out.println("Wrong input please try again.");
                return getTop();
        }
    }
    
    public static void main (String[] args) {
        
        
        PizzaSize size = getSize();
        PizzaTopings top = getTop();
        Pizza pizza = new Pizza(top, size);
        Cost cost = new Cost(pizza);
        System.out.println("Your pizza will cost $" + cost.getCost() + ".");
    }
}
