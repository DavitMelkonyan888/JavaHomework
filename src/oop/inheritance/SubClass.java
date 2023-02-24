package oop.inheritance;

public class SubClass extends SuperClass{
    public String message = "Hello SubClass class";
    
    public String type(){
        return super.message;
    }
}
