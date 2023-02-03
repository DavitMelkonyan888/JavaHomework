package homework3;

public class Car {
    String model;
    String color;
    int currentSpeed = 0;
    boolean isEngineStart = false;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }
    /**
     * Turn off the engine
     * */
    public void stopEngine(){
        this.isEngineStart = false;
    }

    /**
     * Turn on the engine
     * */
    public void startEngine(){
        this.isEngineStart = true;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Mercedes C203", "sev");
        Car car2 = new Car("Mercedes S505", "spitak");
    }
}
