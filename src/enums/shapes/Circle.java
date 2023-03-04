package enums.shapes;

public class Circle extends Shape{
    
    private double r;
    
    public Circle (double r) {
        this.r = r;
    }
    
    /**
     * This function will return the area of the circle
     * @return
     */
    @Override
    public double getArea () {
        return Math.PI * r * r;
    }
    
    /**
     * This function will return the perimeter of the circle
     * @return
     */
    @Override
    public double getPerimeter () {
        return 2 * Math.PI * r;
    }
}
