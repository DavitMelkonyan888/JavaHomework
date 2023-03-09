package exceptions;

import exceptions.myexcep.InvalidAge;

import java.util.Scanner;

public class Age {
    
    public static void main (String[] args) throws InvalidAge {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age (0-120) --> ");
        int age = sc.nextInt();
        
        if (age < 0 || age > 120) throw new InvalidAge("Invalid Age");
        System.out.println("Success");
    }
    
}
