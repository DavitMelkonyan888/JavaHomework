package enums.shapes;

public enum ShapeType {
    SQUARE(new Square(5)),
    RECTANGLE(new Rectangle(5, 8)),
    CIRCLE(new Circle(10));
    
    private Shape shape;
    
    ShapeType (Shape shape) {
        this.shape = shape;
    }
    
    public double getArea () {
        return this.shape.getArea();
    }
    
    public double getPerimeter () {
        return this.shape.getPerimeter();
    }
}
