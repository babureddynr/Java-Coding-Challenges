package Guess_OutPut;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File_Write {

	public static void main(String[] args) throws FileNotFoundException {
		File f1= new File("C:\\Users\\reddy\\OneDrive\\Desktop\\NewReaderfile.txt");
		Scanner sc= new Scanner(f1);
		boolean found=false;
		while(sc.hasNextLine())
		{
			String data = sc.nextLine();
			System.out.println(data);
			if(data.contains("hello world"))
			{
				found=true;
			}
		}
		if(found)
		{
			System.out.println("\"hello world\" is presnt in the filr");
		}
		

	}

}
