package oop.inheritance;

public class Truck extends Car{
    protected int capacity;
    
    public Truck (int passengerCount, char engineType, int capacity) {
        super(passengerCount, engineType);
        this.capacity = capacity;
    }
    
    public Truck (int capacity) {
        this.capacity = capacity;
    }
    
    public Truck () {}
    
    public int getCapacity () {
        return capacity;
    }
    
    public void setCapacity (int capacity) {
        this.capacity = capacity;
    }
}
