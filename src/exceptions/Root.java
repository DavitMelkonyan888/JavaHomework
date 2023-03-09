package exceptions;

import java.util.Scanner;

public class Root {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Enter a number --> ");
        a = sc.nextInt();
        
        try{
            if (a < 0) throw new ArithmeticException("Invalid Input");
            System.out.println(Math.sqrt(a));
        } finally {
            System.out.println("Good Bye.");
        }
        
    }
    
}
