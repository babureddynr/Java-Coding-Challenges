package java_logics.logics;

public class Middle_elemnt_in_array {
	
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3,4, 4, 5}; // Example array
	        
	        int n = arr.length;
	        
	        if (n % 2 == 1) {  // If the length is odd
	            int middleIndex = n / 2;
	            System.out.println("The middle element is: " + arr[middleIndex]);
	        } else {  // If the length is even
	            int middleIndex1 = (n / 2) - 1;
	            int middleIndex2 = n / 2;
	            System.out.println("The middle elements are: " + arr[middleIndex1] + " and " + arr[middleIndex2]);
	        }
	    }
	}

