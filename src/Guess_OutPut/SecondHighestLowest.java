package Guess_OutPut;


	import java.util.Arrays;

	public class SecondHighestLowest {

	    public static void main(String[] args) {
	        // Define the array
	        int[] arr = {15, 3, 7, 1, 22, 19, 8, 5};
	        
	        // Check if the array has at least two elements
	        if (arr.length < 2) {
	            System.out.println("Array must have at least two elements.");
	            return;
	        }
	        
	        // Sort the array
	        Arrays.sort(arr);
	        
	        // Display the sorted array (optional, for clarity)
	        System.out.println("Sorted array: " + Arrays.toString(arr));
	        
	        // Find the second lowest and second highest elements
	        int secondLowest = arr[1];  // Second element in the sorted array
	        int secondHighest = arr[arr.length - 2];  // Second last element in the sorted array
	        
	        // Output the results
	        System.out.println("Second Lowest: " + secondLowest);
	        System.out.println("Second Highest: " + secondHighest);
	    }
	}

