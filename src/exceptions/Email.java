package exceptions;

import exceptions.myexcep.InvalidEmail;

import java.util.Scanner;

public class Email {
    
    public static void main (String[] args) throws InvalidEmail {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Email (abc@de.fg) --> ");
        String a = sc.next();
        
        int countDog = 0;
        int dogIndex = 0;
        int countDotAfterDog = 0;
        int dotIndex = 0;
        
        for (int i = 0; i < a.length(); i++){
            if (a.charAt(i) == '@') {
                countDog++;
                dogIndex = i;
            }
        }
        
        if (countDog != 1) throw new InvalidEmail("Invalid Email");
    
        for (int i = dogIndex; i < a.length(); i++){
            if (a.charAt(i) == '.') {
                countDotAfterDog++;
                dotIndex = i;
            }
        }
        
        if (countDotAfterDog != 1 || dotIndex - dogIndex < 2 || a.length() - dotIndex < 2) throw new InvalidEmail("Invalid Email");
    
        System.out.println("Success");
    }
}
