package Guess_OutPut;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Create_File {

    public static void main(String[] args) throws IOException {
        // Create a new file object with the specified path
        File f1 = new File("C:\\Users\\reddy\\OneDrive\\Desktop\\NewReaderfile.txt");
        
        // Check if the file was created successfully
        if (f1.createNewFile()) {
            System.out.println("File is created.");
        } else {
            System.out.println("File already exists.");
        }

        // Write data to the file
        FileWriter f2 = new FileWriter(f1);
        f2.write("hello world");
        f2.close();  // Close the file writer after writing
        System.out.println("Data is written to the file.");
        
        // Read the file and check if it contains a specific string (e.g., "hello")
        Scanner sc = new Scanner(f1);
        boolean found = false;
        while (sc.hasNextLine()) {
            String data = sc.nextLine();
            System.out.println(data);
            if (data.contains("hello")) {  // Check if "hello" is present
                found = true;
            }
        }
        sc.close();  // Close the scanner after reading

        // Print the result of the search
        if (found) {
            System.out.println("\"hello\" is present in the file.");
        } else {
            System.out.println("\"hello\" is not present in the file.");
        }
    }
}
