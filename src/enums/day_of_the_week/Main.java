package enums.day_of_the_week;

import java.util.Scanner;

public class Main {
    
    public static void main (String[] args) {
        Week a;
        Scanner sc = new Scanner(System.in);
        int b;
        do{
            System.out.print("b=");b = sc.nextInt();
        } while(b < 1 || b > 7);
        a = Week.getDay(b);
        System.out.println(a.week());
    }
}
