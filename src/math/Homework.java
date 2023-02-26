package math;

import java.util.Random;
import java.util.Scanner;

public class Homework {
    
    /**
     * rice bags
     * @param x integer
     * @param y integer
     * @param z integer
     * @return boolean
     */

    public boolean riceBags(int x, int y, int z){
        int kilo1 = 1, kilo5 = 5;

        if((x*kilo5 + y*kilo1) < z) return false;
        if((z % kilo5) > y) return false;

        return true;
    }
    
    /**
     * isPrime
     * @param a integer
     * @return boolean
     */
    public boolean isPrime(int a){
        if (a < 2) return false;
        for (int i = 2; i < a; i++){
            if (a % i == 0) return false;
        }
        return true;
    }
    
    /**
     * Factorial
     * @param a number
     * @return factorial of number
     */
    public int factor(int a){
        int x = 1;
        for (int i=2; i < a; i++){
            if (a % i == 0 && this.isPrime(i)) x = i;
        }
        return x;
    }
    
    /**
     * Random number [1-100]
     * @return number
     */
    public int rand(){
        Random my = new Random();
        return my.ints(1, 101).findFirst().getAsInt();
    }
    
    /**
     * Odd or Even
     */
    public void fun3(){
        int x = rand();
        boolean t = x % 2 == 0? true : false;
        System.out.println(x + " " + t);
    }
    
    /**
     * Max and Min
     */
    public void fun4(){
        int i = 0;
        int x1 = rand();
        int min = x1, max= x1;

//        while(i < 10){
//            i++;
//            if (x1 > x2) x2 = rand();
//            else x1 = rand();
//        }
//        int max = x1 > x2 ? x1 : x2;
//
//        i = 0;
//        while(i < 10){
//            i++;
//            if (x1 < x2) x2 = rand();
//            else x1 = rand();
//        }
//        int min = x1 < x2 ? x1 : x2;

        while(i < 10){
            i++;
            x1 = rand();
            min = min > x1 ? x1 : min;
            max = max < x1 ? x1 : max;
        }

        System.out.println("max - " + max);
        System.out.println("min - " + min);
    }
    
    /**
     * Multiply Table
     */
    public void mulTab(){
        Scanner my = new Scanner(System.in);
        int a;
        do{a = my.nextInt();} while(a <= 0);
        for (int i = 1; i < 11; i++){
            System.out.println(a + " * " + i + " = " + (a * i));
        }
    }
    
    /**
     * Power of numbers
     * @param a number1
     * @param b number2
     * @return number1^number2
     */
    public double pow(double a, int b) {
        if (a == 0 && b == 0){
            return Double.NaN;
        }
        double c = 1.0;
        if (a == 0) return 0;

        if (b > 0) {
            for (int i = 0; i < b; i++) c *= a;
            return c;
        }
        else if (b < 0) {
            for (int i = 0; i > b; i--) c *= a;
            return 1 / c;
        }
        else return 1;
    }
    
    /**
     * reverse
     * @return reversed number
     */
    public int pol() {
        Scanner my = new Scanner(System.in);
        int a = my.nextInt();
        int b = a, i = 0;
        while(b  > 0){
            i++;
            b /= 10;
        }
        int x = 0, l;
        while(a > 0){
            l = a % 10;
            x += l * pow(10, --i);
            a /= 10;
        }
        return x;
    }
    
    /**
     * isPrime with input
     */
    public void inpPr(){
        Scanner my = new Scanner(System.in);
        int x;
        do {
            System.out.println("Type a positive number(greater than 0)");
            x = my.nextInt();
        } while (x <= 0);
        if(isPrime(x)) System.out.println("The number you typed is Prime :) ");
        else System.out.println("The number you typed is Not Prime :( ");
    }
    
    /**
     * Adding
     */
    public void twoNums(){
        do{
            Scanner myNum = new Scanner(System.in);
            System.out.println("Type here your first number");
            int a = myNum.nextInt();
            System.out.println("Type here your second number");
            int b = myNum.nextInt();
            System.out.println("The sum of the numbers is - " + (a + b));
            Scanner myStr = new Scanner(System.in);
            System.out.println("Do you want to continue or quit? Y/N");
            String x = myStr.nextLine();
            while(!x.toUpperCase().equals("Y") && !x.toUpperCase().equals("N")){
                System.out.println("Enter Y or N");
                x = myStr.nextLine();
            }
            if (x.toUpperCase().equals("N")) break;
        } while(true);
    }
    
    /**
     * Sorting numbers by sign
     */
    public void manyNums(){
        int positive = 0, negative = 0, zero = 0, inp;
        System.out.println("Write as  numbers as you want");
        do {
            Scanner scanner = new Scanner(System.in);
            inp = scanner.nextInt();

            if (inp>0){
                positive++;
            }else if (inp<0){
                negative++;
            }else zero++;
            Scanner myStr = new Scanner(System.in);
            System.out.println("Do you want to continue or quit? Y/N");
            String x = myStr.nextLine();
            while(!x.toUpperCase().equals("Y") && !x.toUpperCase().equals("N")){
                System.out.println("Enter Y or N");
                x = myStr.nextLine();
            }
            if (x.toUpperCase().equals("N")) break;
        }while (true);

        System.out.println("Positive numbers count " +positive);
        System.out.println("Negative numbers count " +negative);
        System.out.println("Zeros count " +zero);
    }
    
    /**
     * Max and Min
     */
    public void manyNumsMinMax(){
        int max, min = 0, inp;
        System.out.println("Write as  numbers as you want");
        Scanner scanner = new Scanner(System.in);
        min = max = scanner.nextInt();
        do {

            inp = scanner.nextInt();

            if (inp>max){
                max = inp;
            }else if (inp<min){
                min = inp;
            }
            Scanner myStr = new Scanner(System.in);
            System.out.println("Do you want to continue or quit? Y/N");
            String x = myStr.nextLine();
            while(!x.toUpperCase().equals("Y") && !x.toUpperCase().equals("N")){
                System.out.println("Enter Y or N");
                x = myStr.nextLine();
            }
            if (x.toUpperCase().equals("N")) break;
        }while (true);

        System.out.println("Max - " + max);
        System.out.println("Min - " + min);
    }
    
    /**
     * Is Armstrong number or not
     * @param a number
     * @return boolean
     */
    public boolean isArm(int a) {
        int i = 0;
        int b = a;
        while(b  > 0){
            i++;
            b /= 10;
        }
        b = a;
        int x = 0;
        for (int j = 0; j < i; j++){
            x += pow(b % 10, 3);
            b /= 10;
        }
        if(a == x) return true;
        else return false;
    }
    
    /**
     * Typing all Armstrong numbers [1-500]
     */
    public void typeArm() {
        for (int i = 1; i < 501; i++){
            if(isArm(i)) System.out.println(i);
        }
    }
    
    /**
     * Ex. 9
     * @return double
     */
    public double fun9(){
        Scanner my = new Scanner(System.in);
        int n = my.nextInt();
        double x = 0.0;
        for(int i = 1; i < n+1; i++){
            x += 1.0 / i;
        }
        return x;
    }
    
    /**
     * Ex. 10
     * @return double
     */
    public double fun10(){
        Scanner my = new Scanner(System.in);
        int n = my.nextInt();
        double x = 0.0;
        for(int i = 1; i < n+1; i += 2){
            x += 1.0 / i;
        }
        for(int i = 2; i < n+1; i += 2){
            x -= 1.0 / i;
        }
        return x;
    }
    
    /**
     * Guessing number
     */
    public void guess(){
        int x = rand();
        Scanner my = new Scanner(System.in);
        System.out.println("Guess the number");
        int n = my.nextInt();
        while(n != x){
            if(n > x) System.out.println("Too high, try again.");
            else System.out.println("Too low, try again.");
            n = my.nextInt();
        }
        System.out.println("Congratulations!!!!!!!");
    }
    
    /**
     * Ex. 12.1
     */
    public void fun12_1(){
        for (int i =0; i < 4; i++) {
            for (int j = 0; j < 10; j++)
                System.out.print("*");
            System.out.println();
        }
    }
    
    /**
     * Ex. 12.2
     */
    public void fun12_2(){
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
    
    /**
     * Ex. 12.3
     */
    public void fun12_3(){
        for (int i = 1 ; i<6; i++){
            for (int j = 0; j < 5 - i ; j++){
                System.out.print(" ");
            }
            for (int l = 0; l < i; l++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    /**
     * Ex. 12.4
     */
    public void fun12_4(){
        for (int i = 1 ; i < 6; i++){
            for (int j = 0; j <   (9 - (2 * i - 1)) / 2 ; j++){
                System.out.print(" ");
            }
            for (int l = 0; l < i + i - 1; l++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    /**
     * Ex. 12.5
     */
    public void fun12_5(){
        for (int i = 1 ; i < 6; i++){
            for (int j = 0; j < (9 - (2 * i - 1)) / 2 ; j++){
                System.out.print(" ");
            }
            for (int l = 1; l < i + i ; l++ ){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    
    /**
     * Ex. 12.6
     */
    public void fun12_6(){
        for (int i = 1 ; i < 6; i++){
            for (int j = 0; j < (9 - (2 * i - 1)) / 2 ; j++){
                System.out.print(" ");
            }
            int x = i;
            for (int l = 1; l < i ; l++ ){
                System.out.print(x--);
            }
            System.out.print(x);
            for (int l = 1; l < i ; l++ ){
                System.out.print(++x);
            }
            System.out.println();
        }
    }
    
    /**
     * Factorial
     * @param a number
     * @return factorial of number
     */
    public double fact(int a){
        if(a <= 0) return 1.0;
        int b = a;
        double c = 1.0;
        for (int i = 2; i <= b; i++)
            c *= i;
        return c;
    }
    
    /**
     * Sinus
     * @param y angle in degrees
     * @param n accuracy
     * @return double
     */
    public double sin(double y, int n) {
        y %= 360;
        double x = y * Math.PI / 180;
        double a = x;
        for (int i = 5; i <= n; i += 4){
            a += pow(x, i) / fact( i );
            a -= pow(x, i-2) / fact( i-2 );
        }
        return a;
    }
    
    /**
     * Cosinus
     * @param y angle in degrees
     * @param n accuracy
     * @return double
     */
    public double cos(double y, int n) {
        y %= 360;
        double x = y * Math.PI / 180;
        double a =1.0;
        for (int i = 4; i <= n; i += 4){
            a += pow(x, i) / fact( i );
            a -= pow(x, i-2) / fact( i-2 );
        }
        return a;
    }

    public static void main(String[] args) {
        Homework my = new Homework();
        //int x= 5, y=3, z= 24;
        //System.out.println(my.riceBags(x, y, z));
        //System.out.println(my.factor(455));
        //my.fun3();
        //my.fun4();
        //my.mulTab();
        //Scanner myy = new Scanner(System.in);
        //int a = myy.nextInt();
        //int b = myy.nextInt();
        //System.out.println(my.pow(a, b));
        //System.out.println(my.pol());
        //my.inpPr();
        //my.twoNums();
        //my.manyNums();
        //my.manyNumsMinMax();
        //my.typeArm();
        //System.out.println(my.fun9());
        //System.out.println(my.fun10());
        //my.guess();
        //my.fun12_1();
        //my.fun12_2();
        //my.fun12_3();
        //my.fun12_4();
        //my.fun12_5();
        //my.fun12_6();
        //Scanner myy = new Scanner(System.in);
        //double a = myy.nextDouble();
        //int b = myy.nextInt();
        //System.out.println(my.sin(a, b));
        //System.out.println(Math.sin(a*Math.PI/180));
        //System.out.println(my.cos(a, b));
        //System.out.println(Math.cos(a*Math.PI/180));
    }
}
