package enums.shapes;

public class Rectangle extends Shape{
    
    private double a;
    private double b;
    
    public Rectangle (double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    /**
     * This function will return the area of the rectangle
     * @return
     */
    @Override
    public double getArea () {
        return a*b;
    }
    
    /**
     * This function will return the perimeter of the rectangle
     * @return
     */
    @Override
    public double getPerimeter () {
        return 2*(a+b);
    }
}
