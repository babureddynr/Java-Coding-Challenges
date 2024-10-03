package java_logics.logics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Create_File {

    public static void main(String[] args) throws IOException {
        // Create a file object with the desired file path
//        File f1 = new File("C:\\Users\\reddy\\OneDrive\\Desktop\\createFilet.txt");
        
//      FileWriter f2= new FileWriter("C:\\Users\\reddy\\OneDrive\\Desktop\\createFilet.txt");
//      f2.write("hello world again");
//      f2.close();
//      System.out.println("Data Sucessfully written");
    	
//    	File f1= new File("C:\\Users\\reddy\\OneDrive\\Desktop\\createFilet.txt");
//    	Scanner sc= new Scanner(f1);
//    	while(sc.hasNextLine())
//    	{
//    		String data = sc.nextLine();
//    		System.out.println(data);
//    	}
//    	sc.close();
//    
    	File f1= new File("C:\\Users\\reddy\\OneDrive\\Desktop\\createFilet2.txt");
    	if(f1.createNewFile())
    	{
    		System.out.println("File is created sucessfully");
    	}else {
    		System.out.println("file is already present");
    	}
    }
}
