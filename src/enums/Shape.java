package enums;

public enum Shape {
    TRIANGLE{
        /**
         * This function returns area of the triangle
         * @return
         */
        public double getArea() {
            return Math.sqrt(((a+b+c)/2)*(((a+b+c)/2)-a)*(((a+b+c)/2)-b)*(((a+b+c)/2)-c));
        }
    },
    SQUARE {
        /**
         * This function returns area of the square
         * @return
         */
        public double getArea() {
            return a * a;
        }
    },
    RECTANGLE {
        /**
         * This function returns area of the rectangle
         * @return
         */
        public double getArea() {
            return a*b;
        }
    },
    CIRCLE {
        /**
         * This function returns area of the circle
         * @return
         */
        public double getArea() {
            return Math.PI * r *r;
        }
        
    };
    
    double a;
    double b;
    double c;
    double r;
    
    public void setA (double a) {
        this.a = a;
    }
    
    public void setB (double b) {
        this.b = b;
    }
    
    public void setC (double c) {
        this.c = c;
    }
    
    public void setR (double r) {
        this.r = r;
    }
    
    /**
     * This function will return the area of the shape
     * @return
     */
    public abstract double getArea();
    
}