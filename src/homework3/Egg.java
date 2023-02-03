package homework3;

public class Egg {

    /**
     * This function returns optimal number for beginning floor
     * @param n quantity of floors
     * */
    public int find(int n){
        int d = 1 + 8 * n;
        return (int) Math.ceil( ( ( -1 + Math.sqrt(d) ) / 2 ) );
    }

    public static void main(String[] args) {
        Egg my = new Egg();
        System.out.println(my.find(100));
    }
}
