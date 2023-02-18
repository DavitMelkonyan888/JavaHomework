package homework6;

import java.util.ArrayList;

public class Strings {
    
    public int sumOfDigits (String a) {
        char[] c = new char[] {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int    t = 0;
        for (int i = 0; i < a.length(); i++) {
            for (char j : c) {
                if (a.charAt(i) == j) {
                    t += Character.getNumericValue(a.charAt(i));
                }
            }
        }
        return t;
    }
    
    public String mix (String a, String b) {
        StringBuilder my  = new StringBuilder();
        int           min = a.length() > b.length() ? b.length() : a.length();
        for (int i = 0; i < min; i++) {
            my.append(a.charAt(i));
            my.append(b.charAt(i));
        }
        if (a.length() != b.length()){
            boolean       t   = a.length() > b.length();
            if (t) {
                for (int i = b.length(); i < a.length(); i++) {
                    my.append(a.charAt(i));
                }
            } else {
                for (int i = a.length(); i < b.length(); i++) {
                    my.append(b.charAt(i));
                }
            }
        }
        return String.valueOf(my);
    }
    
    public int numberOfWords (String a) {
        int k = 1;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ') {
                k++;
            }
        }
        return k;
    }
    
    public String revertSentence (String a) {
        ArrayList my = new ArrayList();
        ArrayList num = new ArrayList();
        int count=0, si=0, ei=0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' '){
                my.add(a.substring(si, ei+1));
                si = i+1;
                ei = i+1;
                count++;
            } else if (a.charAt(i) == '.') {
                num.add(count);
                my.add(a.substring(si, ei+1));
                si = i+1;
                ei = i;
                count++;
            } else if (i == a.length() - 1) {
                ei = i;
                my.add(a.substring(si, ei+1));
                si = i+1;
            } else {
                ei = i;
            }
        }
        StringBuilder s = new StringBuilder();
        for (int i = my.size()-1, j=0; i >=0; i--, j++) {
            s.append(my.get(i));
            if (num.contains(j)){
                s.append(".");
            }
            s.append(' ');
        }
        return String.valueOf(s);
    }
    
    public int counter(String a, String b){
        int q = 0;
        boolean p = false;
        for (int i = 0; i <= a.length()-b.length(); i++) {
            int t = 0;
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i+j) == b.charAt(j)) t++;
            }
            if (t == b.length()) {
                q++;
            }
        }
        return q;
    }
    
    public String sort(String a){
        char[] b = new char[a.length()];
        for (int i = 0; i < a.length(); i++) {
            b[i] = a.charAt(i);
        }
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < a.length()-1; j++) {
                if (b[j] < b[j+1]){
                    b[j] = (char)(b[j] ^ b[j+1] ^ (b[j+1]=b[j]));
                }
            }
        }
        return String.valueOf(b);
    }
    
    public String compressed(String a){
        StringBuilder my = new StringBuilder();
        int q = 1;
        char c = a.charAt(0);
        for (int i = 1; i < a.length(); i++) {
            if (c == a.charAt(i)){
                q++;
            } else {
                my.append(c);
                my.append(q);
                c = a.charAt(i);
                q =1;
            }
            if (i == a.length()-1){
                my.append(c);
                my.append(q);
            }
        }
        return String.valueOf(my);
    }
    
    public static void main (String[] args) {
        Strings my = new Strings();
        //System.out.println(my.sumOfDigits("123fds"));
        //System.out.println(my.mix("AAAAAAAAAA", "BBBBBB"));
        //System.out.println(my.numberOfWords("This is sample sentence"));
        //System.out.println(my.revertSentence("A, B. D. C. ll pp l."));
        //System.out.println(my.counter("dododo dotdo it nowdo", "do"));
        //System.out.println(my.sort("onomatopoeia"));
        //System.out.println(my.sort("fohjwf42os"));
        //System.out.println(my.compressed("kkkktttrrrrrrrrrr"));
        //System.out.println(my.compressed("p555ppp7wwwq"));
    }
}
