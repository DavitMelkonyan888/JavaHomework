package homework6;

import java.util.ArrayList;
import java.util.List;

public class StringUtil_2 {
    
    /**
     * Ex.1
     *
     * @param a String
     * @return String
     */
    public String fun1 (String a) {
        StringBuilder b = new StringBuilder();
        if (a.length() > 0) {
            b.append(a.charAt(0));
        }
        if (a.length() > 1) {
            b.append(a.charAt(1));
        }
        return String.valueOf(b);
    }
    
    /**
     * Ex.2	Count the number of String b in String a
     *
     * @param a String
     * @param b String
     * @return int
     */
    public int counter (String a, String b) {
        int     q = 0;
        boolean p = false;
        for (int i = 0; i <= a.length() - b.length(); i++) {
            int t = 0;
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i + j) == b.charAt(j)) {
                    t++;
                }
            }
            if (t == b.length()) {
                q++;
            }
        }
        return q;
    }
    
    /**
     * Ex.3 isPalindrome
     *
     * @param a String
     * @return boolean
     */
    public boolean isPalindrome (String a) {
        if (a.length() < 2) {
            return true;
        } else if (a.charAt(0) != a.charAt(a.length() - 1)) {
            return false;
        } else {
            return isPalindrome(a.substring(1, a.length() - 1));
        }
    }
    
    /**
     * Ex.4
     *
     * @param a list of Strings
     * @return list of Strings
     */
    public List fun4 (String... a) {
        List b = new ArrayList <>();
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() == 3 && a[i].charAt(0) == 'a') {
                b.add(a[i]);
            }
        }
        return b;
    }
    
    /**
     * Ex.5
     *
     * @param a list of int
     * @return String
     */
    public String fun5 (int... a) {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                b.append("e");
            } else {
                b.append("o");
            }
            b.append(a[i]);
            b.append(",");
        }
        return String.valueOf(b);
    }
    
    /**
     * Ex.6 Decoder of Cesar
     *
     * @param a String
     * @param n int
     * @return String
     */
    public String decoder (String a, int n) {
        String        c = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            try {
                b.append(c.charAt(c.indexOf(a.charAt(i)) - n));
            } catch (Exception e) {
                b.append(c.charAt(c.indexOf(a.charAt(i)) + 26 - n));
            }
        }
        return String.valueOf(b);
    }
    
    /**
     * Ex.7 longest palindrome substring
     *
     * @param a String
     * @return String
     */
    public String longestPalindrome (String a) {
        int     si = 0, l1 = 1, l2 = 1;
        boolean t;
        for (int i = 0; i < a.length() - 1; i++) {
            for (int j = i + 1; j < a.length(); j++) {
                t = isPalindrome(a.substring(i, j + 1));
                if (t) {
                    l2 = j - i + 1;
                    if (l2 > l1) {
                        si = i;
                        l1 = l2;
                    }
                }
            }
        }
        
        StringBuilder b = new StringBuilder();
        b.append(a.substring(si, si + l1));
        return String.valueOf(b);
    }
    
    /**
     * Ex.8 longest common substring
     *
     * @param a String
     * @param b String
     * @return String
     */
    public String longestCommon (String a, String b) {
        int q1 = 0, q2 = 0, si = 0;
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    q2 = 1;
                    for (int k = 1; k < Math.min(a.length() - i, b.length() - j); k++) {
                        if (a.charAt(i + k) == b.charAt(j + k)) {
                            q2++;
                        } else {
                            break;
                        }
                    }
                    if (q2 > q1) {
                        q1 = q2;
                        si = i;
                    }
                }
            }
        }
        StringBuilder c = new StringBuilder();
        c.append(a.substring(si, si + q1));
        return String.valueOf(c);
    }
    
    /**
     * Ex.9 count of common characters
     *
     * @param a String
     * @param b String
     * @return int
     */
    public int countCommonChars (String a, String b) {
        ArrayList c = new ArrayList();
        ArrayList d = new ArrayList();
        for (int i = 0; i < a.length(); i++) {
            if (!c.contains(a.charAt(i))){
                c.add(a.charAt(i));
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if (!d.contains(b.charAt(i))){
                d.add(b.charAt(i));
            }
        }
        int q = 0;
        for (int i = 0; i < c.size(); i++) {
            if (d.contains(c.get(i))) q++;
        }
        return q;
    }
    
    /**
     * Ex.10
     *
     * @param a String
     * @return String
     */
    public String fun10(String a){
        StringUtil my = new StringUtil();
        ArrayList<Integer> q1 = new ArrayList<Integer>();
        ArrayList<Integer> q2 = new ArrayList<Integer>();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '(') q1.add(i);
            else if (a.charAt(i) == ')') q2.add(i);
        }
        if (q1.size() != q2.size()){
            return "Invalid Input";
        } else if (q1.size() == 0) {
            return a;
        }
        StringBuilder c = new StringBuilder(a);
        if (q1.get(0)>q2.get(0)){
            return a.substring(q1.get(q1.size()-1)+1) + my.reverse(fun10(a.substring(q2.get(0)+1, q1.get(q1.size()-1)))) + a.substring(0, q2.get(0));
        } else {
            return a.substring(0, q1.get(0)) + my.reverse(fun10(a.substring(q1.get(0)+1, q2.get(q2.size()-1)))) +  a.substring(q2.get(q2.size()-1)+1);
        }
    }
}
