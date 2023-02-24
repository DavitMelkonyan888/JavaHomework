package oop.abstractes;

public class Circle extends Shape{
    
    @Override
    public void draw () {
        System.out.println("Drawing some circle");
    }
    
    @Override
    public void erase () {
        System.out.println("Erasing the circle");
    }
}
