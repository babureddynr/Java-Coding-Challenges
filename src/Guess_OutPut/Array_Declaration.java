package Guess_OutPut;

import java.io.File;
import java.util.Scanner;

public class Array_Declaration {
	public static void main(String[] args) {


		int[] arr = new int[5];
		try {
			arr[2] = 10;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Size exceed the array limit is 10 index only ");
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}