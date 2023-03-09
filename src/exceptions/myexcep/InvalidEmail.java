package exceptions.myexcep;

public class InvalidEmail extends Exception{
    public InvalidEmail(String message) {
        super(message);
    }
    
    public InvalidEmail() {}
}
