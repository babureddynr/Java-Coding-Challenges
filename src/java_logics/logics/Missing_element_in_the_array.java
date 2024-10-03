package java_logics.logics;

public class Missing_element_in_the_array {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4,6 }; // Array with a missing element
		int n = arr.length + 1; // Array length + 1 because one number is missing

		// Sum of first n natural numbers formula: n * (n + 1) / 2
		int expectedSum = n * (n + 1) / 2;

		// Calculate the sum of the elements in the array
		int actualSum = 0;
		for (int i = 0; i < arr.length; i++) {
			actualSum += arr[i];
		}

		// The missing number is the difference between expectedSum and actualSum
		int missingNumber = expectedSum - actualSum;
		System.out.println("The missing number is: " + missingNumber);
	}
}
