package exceptions.myexcep;

public class InvalidAge extends Exception{
    public InvalidAge(String message) {
        super(message);
    }
    
    public InvalidAge() {}
}
