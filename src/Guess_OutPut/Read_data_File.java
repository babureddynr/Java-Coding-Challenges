package Guess_OutPut;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read_data_File {

	public static void main(String[] args) throws FileNotFoundException {
		File f1 = new File("C:\\Users\\reddy\\OneDrive\\Desktop\\Myself.txt");
		Scanner sc = new Scanner(f1);
		boolean found = false;
		while (sc.hasNextLine()) {
			String data = sc.nextLine();
			System.out.println(data);
			if (data.contains("Babu")) {
				found = true;
				break;
			}
		}
		sc.close();
		if (found) {
			System.out.println("Vales is presnt ");
		} else {
			System.out.println("Not present");
		}
	}

}
