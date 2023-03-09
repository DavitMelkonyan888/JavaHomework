package exceptions;

import java.util.Scanner;

public class Devide {
    
    public static void main (String[] args) {
        double a, b;
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter First Number --> ");
        a = sc.nextDouble();
    
        System.out.print("Enter Second Number --> ");
        b = sc.nextDouble();
        
        if (b == 0) throw new ArithmeticException("Second Number can't be 0 !!!!!!");
    
        System.out.println(a/b);
    }
    
}
