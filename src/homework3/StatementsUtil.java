package homework3;

public class StatementsUtil {

    /**
     * This function figures out is the number even or not
     * @param a some integer
     * @return true or false
     * */
    public boolean isEven(int a){
        boolean x = a % 2 == 0 ? true : false;
        return x;
    }

    /**
     * This function figures out is the number positive, negative or equals 0
     * @param a some integer
     * @return String "positive", "negative" or "0"
     * */
    public String sign(int a){
        String x = a > 0 ? "positive" : a < 0 ? "negative" : "0";
        return x;
    }

    /**
     * This function figures out is the number between 5-8, 15-20 or not
     * @param a some integer
     * @return String "5-8", "15-20" or "other"
     * */
    public String fun3(int a){
        String x = a > 5 && a < 8 ? "5-8" : a < 20 && a > 15 ? "15-20" : "other";
        return x;
    }

    /**
     * This function figures out is the number divisible by 5 and by 7 or not
     * @param a some integer
     * @return true or false
     * */
    public boolean fun4(int a){
        boolean x = a % 5 == 0 && a % 7 == 0 ? true : false;
        return x;
    }

    /**
     * This function figures out is the 2nd digit of number 7 or not
     * @param a three digit integer
     * @return true or false
     * */
    public boolean fun5(int a){
        boolean x = ((a / 10) % 10) == 7 ? true : false;
        return x;
    }

    /**
     * This function figures out is the coordinate on the circle K(0, 5)
     * @param a some double
     * @param b some double
     * @return true or false
     * */
    public boolean fun6(double a, double b){
        boolean x = (Math.sqrt(a*a + b*b)) == 5 ? true : false;
        return x;
    }

    /**
     * This function figures out which is the max number
     * @param a some double
     * @param b some double
     * @param c some double
     * @return true or false
     * */
    public double max(double a, double b, double c){
        double x = a > b && a > c ? a : b > c ? b : c;
        return x;
    }

    /**
     * This function figures out is the year leap
     * @param a some integer
     * @return true or false
     * */
    public boolean fun8(int a){
        boolean x = a % 4 == 0 ? a % 100 == 0 ? a % 400 == 0 ? true : false : true : false;
        return x;
    }

    /**
     * Outputs numbers [1-200]
     * */
    public void fun11(){
        for (int i = 1; i < 201; i++)
            System.out.println(i);
    }

    /**
     * This function returns first digit of the number
     * @param number some integer
     * @return integer
     * */
    public int fun12(int number){
        int qan = 0;
        for(int basis = 0; number >basis; ++qan)
            basis = (basis << 3) + (basis << 1) + 9;
        int x = number / (int) Math.pow(10, qan-1);
        return x;
    }

    /**
     * Outputs numbers x[1-4] + y[0-9]
     * */
    public void fun13(){
        for (int x = 1, y = 0; x < 5; x++)
            for (y = 0; y< 10; y++)
                System.out.println(x + y);
    }

    /**
     * Outputs square
     * @param n size of square
     * @param c some character
     * */
    public void fun14(int n, char c){
        for (int i = 0; i < n; i++) {
            System.out.print(c);
            System.out.print(" ");
        }
        System.out.println("");
        for (int i = 0; i < n-2; i++){
            System.out.print(c);
            for (int j = 0; j < n-2; j++)
                System.out.print("  ");
            System.out.print(" ");
            System.out.println(c);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(c);
            System.out.print(" ");
        }
    }

    /**
     * This function returns sum of number[1-N] divisible by 5
     * @return integer
     * */
    public int fun15(){
        int x = 0, n;
        java.util.Scanner my = new java.util.Scanner(System.in);
        n = my.nextInt();
        my.close();
        for (int i = 5; i <= n; i += 5)
            x += i;
        return x;
    }

    /**
     * Outputs sum of even numbers[10-69]
     * */
    public void fun16(){
        long x = 1;
        for (int i = 10; i < 69; i += 2)
            x *= i;
        System.out.println(x);
    }

    /**
     * Outputs arithmetic mean [1-N]
     * @param n some integer
     * */
    public void fun17(int n){
        double x = (1 + n) / 2.0;
        System.out.println(x);
    }

    /**
     * This function returns sum of digits of the number
     * @param a some integer
     * @return integer
     * */
    public int fun18(int a){
        int x = 0;
        x += a / 10000;
        x += (a / 1000) % 10;
        x += (a / 100) % 10;
        x += (a / 10) % 10;
        x += a % 10;
        return x;
    }

    public static void main(String[] args) {
        int x = 0;
        while (x++ < 10) {
            if (x == 8) break;
        }
        System.out.println(x);

        x = 2;
        int y = 5;
        while (x < 10) {
            x++;
        }

        x = 15;
        while (x > 10) {
            x--;
        }
        System.out.println(x);
    }
}
