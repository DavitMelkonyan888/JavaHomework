package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class File {
    
    public static void main (String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write the path --> ");
        String str = sc.next();
        try {
            java.io.File    file = new java.io.File(str);
            FileInputStream fis  = new FileInputStream(file);
            System.out.println("file content: ");
            int r=0;
            while((r=fis.read())!=-1)
            {
                System.out.print((char)r);
            }
        } catch(FileNotFoundException e){
            throw new FileNotFoundException("Not Found");
        } catch (Exception e) {
            throw new RuntimeException(e + "!!!!!!!!!!!!!!!!!!!!!!");
        }
    }
    
}
