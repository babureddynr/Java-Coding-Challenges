package Guess_OutPut;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class File_String_Find {

	public static void main(String[] args) throws FileNotFoundException {
		Map<Integer, String> map= new HashMap<>();
		map.put(1, "A");
		for(String num: map.values())
			

		{// To iterate values only
			System.out.println(num);
		}
		// to iterate both values and keys
		System.out.println(map.entrySet());
	}

}
