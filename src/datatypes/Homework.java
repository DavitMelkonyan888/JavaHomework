package datatypes;

public class Homework {
    public static void main(String[] args) {
        //1
        byte a = -99, b = 117;
        System.out.println("1 " + a + " " + b);

        //2
        short c = 450, d = -364;
        System.out.println("2 " + c + " " + d);

        //3
        int e = 15786, f = -658400;
        System.out.println("3 " + e + " " + f);

        //4
        long g = -568451351L, h = 351498451351L;
        System.out.println("4 " + g + " " + h);

        //5
        byte minByte = -128, maxByte = -127;
        System.out.println("5 " + minByte + " " + maxByte);

        short minShort =  -32768, maxShort =  32767;
        System.out.println("5 " + minShort + " " + maxShort);

        int minInt = -2147483648, maxInt =  2147483647;
        System.out.println("5 " + minInt + " " + maxInt);

        long minLong = -9223372036854775808L, maxLong =  9223372036854775807L;
        System.out.println("5 " + minLong + " " + maxLong);

        //6
        float j = 9.1f, k = 9.2f;
        System.out.println("6 " + j + " " + k);

        //7
        double l = 9.3, m = 9.4;
        System.out.println("7 " + l + " " + m);


        //8
        float maxFloat = 3.4028235E+38F, minFloat = 1.4E-45F;
        System.out.println("8 " + maxFloat + " " + minFloat);

        double maxDouble = 1.7976931348623157E+308, minDouble = 4.9E-324;
        System.out.println("8 " + maxDouble + " " + minDouble);

        //9
        float myFloat1 = 12.345f;
        float myFloat2 = 3456.091f;
        double myDouble1 = 8923.1234857;
        double myDouble2 = 34.567839023;

        //10
        char n ='a', o ='b';
        System.out.println("10 " + n + " " + o);

        //11.1
        char s = 77, w = 109;
        System.out.println("11.1 " + s + " " + w);

        //11.2
        char t = 57;
        System.out.println("11.2 " + t);

        //12
        boolean p =true, q =false;
        System.out.println("12 " + p + " " + q);

        //13
        //int year = 201|;   //java: illegal start of expression
        //System.out.println(year);

        //14
        int aa = 7;
        long bb = aa;
        System.out.println("14 " + bb);

        //15
        int myInt = 7;
        double myDouble = myInt;
        System.out.println("15 " + myDouble);

        //16
        double dd = 9.78d;
        int ii = (int) dd;
        System.out.println("16 " + ii);

        //17
        int ff = 9999;
        byte gg = (byte) ff;
        System.out.println("17 " + gg);

        //18
        long max = 3123456789L; //after number, you should use letter L or l
        double ddd = 1_000.00;// _ & . can't be used together
        char iii = 'i';
        char jjj=  'j';
        //char ij = i + j;  // you can't use + operator with char
        int a7 = 8; //int 7a = 8; variables names should start with letters or _ or $
        //long h = h + 8; you can't use your local variables before assigning them
        //int n,m = 11;
        //m = n;
    }
}