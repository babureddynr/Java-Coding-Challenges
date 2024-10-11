package Guess_OutPut;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Equal_Array {
public static void main(String[] args) {
	int[] arr1= {1,2,3,3};
	int[] arr2= {1,2,3,3};
	boolean isEqual= Arrays.equals(arr1, arr2);
	System.out.println(isEqual);
}
}
