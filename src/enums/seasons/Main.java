package enums.seasons;

import java.util.Scanner;

public class Main {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Enter a temperature: ");
        a = sc.nextInt();
        System.out.print(a + " The temperature corresponds to " + Season.getSeasonByTemperature(a));
    }
}
