package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountOfWordsInFile {
    
    public static void main (String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write the path --> ");
        String str = sc.next();
        try {
            java.io.File    file = new java.io.File(str);
            FileInputStream fis  = new FileInputStream(file);
            int r=0, s = 0;
            if ((r=fis.read())!=-1) {
                s = 1;
                while ((r = fis.read()) != -1) {
                    if ((char) r == ' ')
                        s++;
                }
            }
            System.out.println("Count = " + s);
        } catch(FileNotFoundException e){
            throw new FileNotFoundException("Not Found");
        } catch (Exception e) {
            throw new RuntimeException(e + "!!!!!!!!!!!!!!!!!!!!!!");
        }
    }
    
}
