package java_logics.logics;

public class Second_max_Second_min {

	public static void main(String[] args) {
		
		        int[] arr = {9, 2, 2, 2, 1, 17};

		        // Initialize first and second min and max values
		        int low = Integer.MAX_VALUE;
		        int secondLow = Integer.MAX_VALUE;
		        int high = Integer.MIN_VALUE;
		        int secondHigh = Integer.MIN_VALUE;

		        // Loop to find the min, second min, max, and second max values
		        for (int i = 0; i < arr.length; i++) {
		            // Find max and second max
		            if (arr[i] > high) {
		                secondHigh = high; // Update second max
		                high = arr[i];     // Update max
		            } else if (arr[i] > secondHigh && arr[i] != high) {
		                secondHigh = arr[i]; // Update second max only if not equal to max
		            }

		            // Find min and second min
		            if (arr[i] < low) {
		                secondLow = low; // Update second min
		                low = arr[i];    // Update min
		            } else if (arr[i] < secondLow && arr[i] != low) {
		                secondLow = arr[i]; // Update second min only if not equal to min
		            }
		        }

		        // Output second highest and second lowest
		        System.out.println(secondHigh + " is the second highest value in the array");
		        System.out.println(secondLow + " is the second lowest value in the array");
		    }
		}


