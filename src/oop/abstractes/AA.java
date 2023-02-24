package oop.abstractes;

public class AA extends Marks{
    
    private int a;
    private int b;
    private int c;
    
    public AA (int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public double getPercentage () {
        return (a+b+c)/3.0;
    }
}
