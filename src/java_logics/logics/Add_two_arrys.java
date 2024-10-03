package java_logics.logics;

public class Add_two_arrys {

	public static void main(String[] args) {
	
		int[] arr1= {1,2,3,4,5};
		int[] arr2= {1,2,3,4,5};
		int[] arr3= new int[5];
		
		for(int i=0; i<arr1.length; i++)
		{
			arr3[i]=arr1[i]+arr2[i];
		}
		for(int i=0; i<arr3.length; i++)
		{
		System.out.println(arr3[i]);
	}

}}
