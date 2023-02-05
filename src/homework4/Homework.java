package homework4;

import java.util.Random;
import java.util.Scanner;

public class Homework {

    public boolean riceBags(int x, int y, int z){
        int kilo1 = 1, kilo5 = 5;

        if((x*kilo5 + y*kilo1) < z) return false;
        if((z % kilo5) > y) return false;

        return true;
    }

    public boolean isPrime(int a){
        for (int i = 2; i < a; i++){
            if (a % i == 0) return false;
        }
        return true;
    }

    public int factor(int a){
        int x = 1;
        for (int i=2; i < a; i++){
            if (a % i == 0 && this.isPrime(i)) x = i;
        }
        return x;
    }

    public int rand(){
        Random my = new Random();
        return my.ints(1, 101).findFirst().getAsInt();
    }

    public void fun3(){
        int x = rand();
        boolean t = x % 2 == 0? true : false;
        System.out.println(x + " " + t);
    }

    public void fun4(){
        int i = 0;
        int x1 = rand();
        int min = x1, max= x1;

//        while(i < 10){
//            i++;
//            if (x1 > x2) x2 = rand();
//            else x1 = rand();
//        }
//        int max = x1 > x2 ? x1 : x2;
//
//        i = 0;
//        while(i < 10){
//            i++;
//            if (x1 < x2) x2 = rand();
//            else x1 = rand();
//        }
//        int min = x1 < x2 ? x1 : x2;

        while(i < 10){
            i++;
            x1 = rand();
            min = min > x1 ? x1 : min;
            max = max < x1 ? x1 : max;
        }

        System.out.println("max - " + max);
        System.out.println("min - " + min);
    }

    public void mulTab(){
        Scanner my = new Scanner(System.in);
        int a;
        do{a = my.nextInt();} while(a <= 0);
        for (int i = 1; i < 11; i++){
            System.out.println(a + " * " + i + " = " + (a * i));
        }
    }

    public double pow(int a, int b) throws Exception {
        if (a == 0 && b == 0){
            throw new ArithmeticException("Can't raise 0 to the power of 0");
        }
        int c = 1;
        if (a == 0) return 0;

        if (b > 0) {
            for (int i = 0; i < b; i++) c *= a;
            return c;
        }
        else if (b < 0) {
            for (int i = 0; i > b; i--) c *= a;
            return 1.0 / c;
        }
        else return 1;
    }

    public static void main(String[] args) throws Exception {
        Homework my = new Homework();
        //int x= 5, y=3, z= 24;
        //System.out.println(my.riceBags(x, y, z));
        //System.out.println(my.factor(455));
        //my.fun3();
        //my.fun4();
        //my.mulTab();
        //Scanner myy = new Scanner(System.in);
        //int a = myy.nextInt();
        //int b = myy.nextInt();
        //System.out.println(my.pow(a, b));
    }

}
