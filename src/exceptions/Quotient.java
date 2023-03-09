package exceptions;

import java.util.Scanner;

public class Quotient {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number --> ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number --> ");
        int b = sc.nextInt();
    
        System.out.println(a/b);
    }
    
}
