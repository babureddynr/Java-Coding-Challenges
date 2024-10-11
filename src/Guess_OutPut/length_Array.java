package Guess_OutPut;

public class length_Array {

	public static void main(String[] args) {
	
int[] arr= {1,2,2,2,23,3};
int n=arr.length;
for(int i=0; i<n/2; i++)
{
	int temp=arr[i];
	arr[i]=arr[n-i-1];
	arr[n-i-1]=temp;
}
for(int a: arr)
{
	System.out.print(a+" ");
}
	}

}
