package oop.abstractes;

public class Triangle extends Shape{
    
    @Override
    public void draw () {
        System.out.println("Drawing some triangle");
    }
    
    @Override
    public void erase () {
        System.out.println("Erasing the triangle");
    }
}
