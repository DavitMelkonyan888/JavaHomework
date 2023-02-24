package oop.abstractes;

public class BB extends Marks{
    
    private int a;
    private int b;
    private int c;
    private int d;
    
    public BB (int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public double getPercentage () {
        return (a+b+c+d)/4.0;
    }
}
