package java_logics.logics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Reverse_An_array {

	public static void main(String[] args) {
int[] arr= {1,2,3,3,3,9}
;
int high=arr[0];
int low=arr[0];
for(int i=1; i<arr.length; i++)
{
	if(arr[i]>high)
	{
		high=arr[i];
		
	}
	if(arr[i]<low)
	{
		low=arr[i];
	}
}
System.out.println("the high value  "+high);
System.out.println("The lowest value   "+low);
	}

}
