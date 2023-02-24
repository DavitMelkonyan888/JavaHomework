package oop.abstractes;

public class Square extends Shape{
    
    @Override
    public void draw () {
        System.out.println("Drawing some square");
    }
    
    @Override
    public void erase () {
        System.out.println("Erasing the square");
    }
}
