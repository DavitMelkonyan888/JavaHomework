package exceptions;

import java.util.Scanner;

public class Reciprocal {
    
    public static void main (String[] args) {
        int     a;
        double  answer;
        Scanner sc = new Scanner(System.in);
        System.out.print("Write some integer (but not 0) --> ");
        a = sc.nextInt();
        if (a == 0)
            throw new ArithmeticException("You entered 0");
        answer = 1.0 / a;
        System.out.println(answer);
    }
    
}
