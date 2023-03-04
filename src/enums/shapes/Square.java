package enums.shapes;

public class Square extends Shape{
    
    private double a;
    
    public Square(double a){
        this.a = a;
    }
    
    /**
     * This function will return the area of the square
     * @return
     */
    @Override
    public double getArea () {
        return a*a;
    }
    
    /**
     * This function will return the perimeter of the square
     * @return
     */
    @Override
    public double getPerimeter () {
        return 4*a;
    }
}
