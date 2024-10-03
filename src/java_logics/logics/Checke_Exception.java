package java_logics.logics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Checke_Exception {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
try {

File f1= new File("C:\\Users\\reddy\\OneDrive\\Desktop\\Myself.txt");  //
Scanner sc= new Scanner(f1);
while(sc.hasNextLine())
{
	String data = sc.nextLine();
	System.out.println(data);
//	System.out.println("Succesfullt read the data on the File");
}
sc.close();
}catch(FileNotFoundException e)
{
	System.out.println("File was not Found");
}
	}

}
