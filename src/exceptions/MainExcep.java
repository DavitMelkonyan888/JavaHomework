package exceptions;

import exceptions.myexcep.*;

import java.util.Scanner;

public class MainExcep {
    
    public static void main (String[] args) throws Exception {
        
        int l;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter (1-3) --> ");
        l = sc.nextInt();
        
        try {
            switch (l) {
                case 1:
                    throw new First("1");
                case 2:
                    throw new Second("2");
                case 3:
                    throw new Third("3");
                default:
                    throw new Exception("Default");
            }
        } catch (Exception e){
            System.out.println(e);
            throw e;
        }
    }
    
}
