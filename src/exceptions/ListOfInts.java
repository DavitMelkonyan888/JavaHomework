package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ListOfInts {
    
    public static void main (String[] args) {
        int n, x[], s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Count of Numbers --> ");
        try {
            n = sc.nextInt();
            x = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = sc.nextInt();
                s += x[i];
            }
            System.out.println(s);
        } catch (InputMismatchException e){
            throw new InputMismatchException("Wrong Input. Not a Number");
        }
    }
    
}
