package java_logics.logics;

import java.util.HashSet;
import java.util.Set;

public class Count_The_charcters {
public static void main(String[] args) {
int[] arr= {1,2,3,3,3,3,4};
int n=arr.length;
for(int i=0; i<n/2; i++)
	
{
	int temp=arr[i];
	arr[i]=arr[n-i-1];
	arr[n-i-1]=temp;
}
for(int i=0; i<arr.length; i++)
{
	System.out.print(arr[i]+" ");
}
	
}
}
