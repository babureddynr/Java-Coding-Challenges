package Guess_OutPut;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FindStringInFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\reddy\\OneDrive\\Desktop\\createFilet2.txt"));
        String line;
        boolean found = false;
        while ((line = reader.readLine()) != null) {
            if (line.contains("babureddynr")) {
                System.out.println("String found in file!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("String not found in file.");
        }
        reader.close();
    }
}
