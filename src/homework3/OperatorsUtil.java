package homework3;

public class OperatorsUtil {

    /**
     * Arithmetical actions with integers
     * */
    public void intActions(){
        int a=8, b=6;
        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a - b);
        System.out.println(a % b);
    }

    /**
     * Arithmetical actions with doubles
     * */
    public void doubleActions(){
        double c=6.4, d=0.03;
        System.out.println(c + d);
        System.out.println(c * d);
        System.out.println(c / d);
        System.out.println(c - d);
        System.out.println(c % d);
    }

    /**
     * Some arithmetical actions
     * */
    public void fun3(){
        int x = 2 * ((5 + 3) * 4 - 8);
        int y = 2 * 5 + 3 * 4 - 8;
        System.out.println(x);
        System.out.println(y);
    }

    /**
     * Using unary operators
     * */
    public void fun4(){
        int e = 10, f = -88;
        boolean n1 = true;
        System.out.println(-e);
        System.out.println(-f);
        System.out.println(+e);
        System.out.println(-e +92);
        System.out.println(!n1);
        System.out.println(!(!n1));
        System.out.println(e++);
        System.out.println(--f);

        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println("x is " + x);
        System.out.println("y is " + y);
    }

    /**
     * Using assignment operators
     * */
    public void fun5(){
        int x = (int)1.0;
        System.out.println(x);
        short y = (short)1921222;
        System.out.println(y);
        System.out.print(2147483647+1);
        long yy = (x=3);
        System.out.println(yy); //????????????????????????????????????????
        System.out.println(yy);
        boolean yyy = false;
        boolean xxx = (yyy = true);
        System.out.println(xxx);
    }

    /**
     * Using relational operators
     * */
    public void fun6(){
        int x = 10, y = 20;
        System.out.println(x < y);
        System.out.println(x <= y);
        System.out.println(x >= y);
        System.out.println(x > y);
    }

    /**
     * Additional task
     * */
    public void fun7(){
        float yyyy = 2.1f;

        byte x = 5;
        byte y = 10;
        byte z = (byte) (x + y);

        short xx = 10;
        short yy = 3;
        short zz = (short) (xx * yy);

        long xxx = 10;
        int yyy = 5;
        yyy = (int) (yyy * xxx);

        int m = 5, n = 10, l;

        System.out.println(m);
        System.out.println(n);

        l = m;
        m = n;
        n = l;

        System.out.println(m);
        System.out.println(n);

        n = n ^ m ^ (m = n);

        System.out.println(m);
        System.out.println(n);

        int a = 1, b = 100, s;
        s = (100+1)*100/2;

        System.out.println(s);
    }

    /**
     * Using Bitwise & Logical Operators
     * */
    public void fun8(){
        int a = 8, b = 3;
        System.out.println(a&b);
        System.out.println(a^b);
        System.out.println(a|b);
        System.out.println(~a);
        System.out.println(true || (a < 4));
        System.out.println((b >= 6) || (++a <= 7));
        System.out.println((a<b)?a:b);
        System.out.println(b^b);
    }

    /**
     * Using Shift Operators
     * */
    public void fun9(){
        //1
        System.out.println(10<<2);
        System.out.println(-10<<3);
        System.out.println(20>>2);
        System.out.println(15>>3);

        //2
        int x = 8;
        System.out.println(x<<3);
        System.out.println(x<<4);
    }

    public static void main(String[] args) {
        OperatorsUtil my = new OperatorsUtil();
        my.intActions();
        my.doubleActions();
        my.fun3();
        my.fun4();
        my.fun5();
        my.fun6();
        my.fun7();
        my.fun8();
        my.fun9();
    }
}