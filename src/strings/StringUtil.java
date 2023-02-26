package strings;

import java.util.Scanner;

public class StringUtil {

    /**
     * Concat
     * */
    public void stringConcat(){
        String a = "hello" + "world";
        System.out.println(a);
        a = 1 + 2 + "hello";
        System.out.println(a);
        a = "1" + 2 + "hello";
        System.out.println(a);
        a = "hello" + 1 + 2 + "world";
        System.out.println(a);
    
        System.out.println();
        
        StringBuilder b = new StringBuilder("hello" + "world");
        System.out.println(b);
        b = new StringBuilder(1 + 2 + "hello");
        System.out.println(b);
        b = new StringBuilder("1" + 2 + "hello");
        System.out.println(b);
        b = new StringBuilder("hello" + 1 + 2 + "world");
        System.out.println(b);
    }
    
    /**
     * Typing each word in new line
     * @param a String
     */
    public void newLine(String a){
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i)==' ') {
                System.out.println();
            }else System.out.print(a.charAt(i));
        }
    }
    
    /**
     * Reverse
     * @param a String
     * @return reversed String
     */
    public String reverse(String a){
        StringBuilder b = new StringBuilder("");
        for (int i = a.length()-1; i >=0; i--) {
            b.append(a.charAt(i));
        }
        return String.valueOf(b);
    }
    
    /**
     * Counter
     * @param a
     * @param token
     * @return
     */
    public int counter(String a, String token){
        int k = 0, ind = 0;
        while(a.indexOf(token, ind)!=-1){
            k++;
            ind = a.indexOf(token, ind)+1;
        }
        return k;
    }
    
    /**
     * To upper case
     * @param a
     * @return
     */
    public String toUpperCase(String a){
//        String c = "";
//        for (int i = 0; i < a.length(); i++) {
//            if (a.charAt(i) > 96 && a.charAt(i) < 123) c += (char)(a.charAt(i)-32);
//            else c += a.charAt(i);
//        }
//        System.gc();
//        return  c;
        
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) > 96 && a.charAt(i) < 123) b.append((char)(a.charAt(i)-32));
            else b.append(a.charAt(i));
        }
        return String.valueOf(b);
    }
    
    /**
     * 20 symbols
     */
    public void symbols20(){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.print(a);
        for (int i = 0; i < 20 - a.length(); i++) {
            System.out.print("*");
        }
    }
    
    /**
     * deleting String
     * @param a
     * @return
     */
    public String delete(String a){
//        String c = a.replace('a', (char) 0);
//        return c;

//        String c = "";
//        for (int i = 0; i < a.length(); i++) {
//            if (a.charAt(i) != 'a') c += a.charAt(i);
//        }
//        System.gc();
//        return c;
        StringBuilder b = new StringBuilder(a);
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) =='a') {
                b.deleteCharAt(i);
                i--;
            }
        }
        return String.valueOf(b);
    }
    
    /**
     * Replacing String
     * @param a
     * @return
     */
    public String replace(String a){
        //a = a.replace('a', '*');
        //return a;
        String c = "";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'a') c += "*";
            else c += a.charAt(i);
        }
        System.gc();
        return c;
    }
    
    /**
     * Longest word
     * @param a
     * @return
     */
    public String longestWord(String a){
        int si1=0, si2 =0, ei=0, count1=0, count2=0;
        boolean t =true;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ') {
                if (count2 > count1) {
                    t=false;
                    ei = i - 1;
                    si1 = si2;
                    count1 = count2;
                }
                count2 = 0;
                si2 = i+1;
            }
            count2++;
        }
        if (count2 > count1) {
            t=false;
            ei = a.length() - 1;
            si1 = si2;
            count1 = count2;
        }
        if (t){
            return a;
        }
        String b = a.substring(si1, ei+1);
        return  b;
    }
    
    /**
     * Index
     * @param a
     * @param b
     * @return
     */
    public int indexOf(String a, String b){
        int q = 0;
        boolean p = false;
        for (int i = 0; i <= a.length()-b.length(); i++) {
            int t = 0;
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i+j) == b.charAt(j)) t++;
            }
            if (t == b.length()) {
                q = i;
                p = true;
                break;
            }
        }
        if (p) return q;
        else return -1;
    }
    
    /**
     * Typing subline
     * @param line
     * @param n
     */
    public void printSubLine(String line, int n){
        for (int i = 0; i < n + 1; i++) {
            System.out.print(line.charAt(i));
        }
        System.out.println();
    }
    
    /**
     * Typing subline
     * @param line
     * @param n
     */
    public void printSubLine(StringBuilder line, int n){
        for (int i = 0; i < n + 1; i++) {
            System.out.print(line.charAt(i));
        }
        System.out.println();
    }
    
    /**
     * Is Not Empty Or Null
     * @param a
     * @return
     */
    public boolean isNotEmptyOrNull(String a){
        boolean t = true;
        if (a == null || a.equals("")) t = false;
        return  t;
    }
    
    /**
     * Longest expression
     * @param a
     * @return
     */
    public String longestExpression(String a){
        int si1=0, si2 =0, ei=0, count1=0, count2=0;
        boolean t =true;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ',') {
                if (count2 > count1) {
                    t=false;
                    ei = i - 1;
                    si1 = si2;
                    count1 = count2;
                }
                count2 = 0;
                si2 = i+1;
            }
            count2++;
        }
        if (count2 > count1) {
            t=false;
            ei = a.length() - 1;
            si1 = si2;
            count1 = count2;
        }
        if (t){
            return a;
        }
        String b = a.substring(si1, ei+1);
        return  b;
    }
}
