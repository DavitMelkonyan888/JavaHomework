package oop.inheritance;

public class Car {
    protected int passengerCount;
    protected char engineType;
    
    public Car (int passengerCount, char engineType) {
        if (passengerCount >= 2)
            this.passengerCount = passengerCount;
        else
            System.out.println("Passengers can't be fewer than 2");
    
        if ((engineType >= 'a' && engineType <= 'z') || (engineType >= 'A' && engineType <= 'Z'))
            this.engineType = engineType;
        else
            System.out.println("Wrong value for engine type");
    }
    
    public Car () {}
    
    public int getPassengerCount () {
        return passengerCount;
    }
    
    public void setPassengerCount (int passengerCount) {
        if (passengerCount >= 2)
            this.passengerCount = passengerCount;
        else {
            System.out.println("Passengers can't be fewer than 2");
        }
    }
    
    public char getEngineType () {
        return engineType;
    }
    
    public void setEngineType (char engineType) {
        if ((engineType >= 'a' && engineType <= 'z') || (engineType >= 'A' && engineType <= 'Z'))
            this.engineType = engineType;
        else {
            System.out.println("Wrong value for engine type");
        }
    }
}
