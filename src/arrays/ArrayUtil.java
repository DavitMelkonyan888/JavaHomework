package arrays;

import math.Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtil {
    
    public void typePositives (int[] n) {
        for (int i = 0; i < n.length; i++) { 
            if (n[i] > 0) {
                System.out.println(n[i]);
            }
        }
    }
    
    public void typeReverse (short[] s) {
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[s.length - 1 - i]);
        }
    }
    
    public void max (long[] l) {
        long max = l[0];
        for (int i = 1; i < l.length; i++) {
            if (l[i] > max) {
                max = l[i];
            }
        }
        System.out.println(max);
    }
    
    public void min (float[] f) {
        float min = f[0];
        for (int i = 1; i < f.length; i++) {
            if (f[i] < min) {
                min = f[i];
            }
        }
        System.out.println(min);
    }
    
    public void texapoxel (int[] n, int[] m) {
        for (int i = 0; i < n.length; i++) {
            m[i] = n[i];
        }
    }
    
    public int[] make3rd () {
        Scanner sc = new Scanner(System.in);
        int     l  = sc.nextInt();
        
        while (l < 2) {
            l = sc.nextInt();
        }
        
        int[] array1 = new int[l], array2 = new int[l], array3 = new int[l];
        
        for (int i = 0; i < l; i++) {
            array1[i] = sc.nextInt();
        }
        
        for (int i = 0; i < l; i++) {
            array2[i] = sc.nextInt();
        }
        
        for (int i = 0; i < l; i++) {
            array3[i] = array1[i] + array2[i];
        }
        
        return array3;
    }
    
    public int counter (int[] a, int k) {
        int c = 0;
        for (int i : a) {
            if (i == k) {
                c++;
            }
        }
        return c;
    }
    
    public int[][] count3 (int[] a) {
        ArrayList arrayList = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (!arrayList.contains(a[i])){
                arrayList.add(a[i]);
            }
        }
        int b = arrayList.size();
        Homework my  = new Homework();
        int      n   = (int) (my.fact(b) / (my.fact(b - 3) * my.fact(3)));
        int[][]  arr = new int[n][3];
        int      l   = 0;
        for (int i = 0; i < b-2; i++) {
            for (int j = 1; j < b - i; j++) {
                for (int k = 1; k < b - i - j; k++) {
                    arr[l][0] = (int) arrayList.get(i);
                    arr[l][1] = (int) arrayList.get(i+j);
                    arr[l][2] = (int) arrayList.get(i+j+k);
                    l++;
                }
            }
        }
        return arr;
    }
    
    public int[] dasavorelNvazmanKargov (int[] arr1) {
        int   n    = arr1.length;
        int[] arr2 = new int[n];
        Arrays.sort(arr1);
        for (int i = 0; i < n; i++) {
            arr2[i] = arr1[n - 1 - i];
        }
        return arr2;
    }
    
    public int[] oddsEnd (int[] a) {
        int[] b = new int[a.length];
        int   j = 0;
        for (int i : a) {
            if (i % 2 == 0) {
                b[j++] = i;
            }
        }
        for (int i : a) {
            if (i % 2 != 0) {
                b[j++] = i;
            }
        }
        return b;
    }
    
    public int[] minus0 (int[] a) {
        int l = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                l++;
            }
        }
        int[] b = new int[l];
        for (int i = 0, m = 0; i < a.length; i++) {
            if (a[i] != 0) {
                b[m++] = a[i];
            }
        }
        return b;
    }
    
    public int qan (int[] a, int b) {
        int qan = 1;
        for (int i = b; i < a.length - 1; i++) {
            if (a[i] <= a[i + 1]) {
                qan++;
            } else {
                break;
            }
        }
        return qan;
    }
    
    public void queue (int[] a) {
        int qan = qan(a, 0);
        int ind = 0;
        for (int i = 1; i < a.length; i++) {
            if (qan < qan(a, i)) {
                qan = qan(a, i);
                ind = i;
            }
        }
        for (int i = ind; i < ind + qan; i++) {
            System.out.print(a[i] + " ");
        }
    }
    
    public void bin (int[] a) {
        int sum = 0;
        for (int i = a.length - 1, j = 0; i >= 0; i--, j++) {
            sum += a[i] * (int) Math.pow(2, j);
        }
        System.out.println(sum);
    }
    
    public void tpelGlxVerev (int[][] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public int[][] rotate (int[][] a) {
        int[][] b = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                b[i][j] = a[j][i];
            }
        }
        return b;
    }
    
    public void oddOrEven (int[][] a) {
        boolean t = true;
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i + 1; j < a[i].length; j++) {
                sum += a[i][j];
            }
            if (sum % 2 != 0) {
                t = false;
            }
        }
        if (t) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    
    public static void main (String[] args) {
        ArrayUtil my  = new ArrayUtil();
        int[]     arr = new int[] {1, 5, 6, 4};
        //        int[][]   arr1 = my.count3(arr);
        //        for (int i = 0; i < arr1.length; i++) {
        //            for (int j : arr1[i])
        //                System.out.print(j + " ");
        //            System.out.println(" ");
        //        }
        //        System.out.println(my.counter(arr, 5));
        //        int[] arr2 = my.dasavorelNvazmanKargov(arr);
        //        for (int i : arr2) {
        //            System.out.print(i + " ");
        //        }
        //        int[] arr2 = new int[]{1, 0, 1, 0, 0, 1, 1};
        //        my.bin(arr2);
        //        my.tpelGlxVerev(arr1);
        //        int[]  array = {1,5,6,4,9,0,4,7,7,9, 1};
        //        my.queue(array);
    }
}
