package classes;

public class Rectangle {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * This function returns the area of the rectangle
     * @return some double
     * */
    public double calculateArea(){
        double x = this.length * this.width;
        return x;
    }

    public static void main(String[] args) {
        Rectangle my = new Rectangle(14, 5);
        System.out.println(my.calculateArea());
    }
}
