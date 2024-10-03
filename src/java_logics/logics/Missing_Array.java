package java_logics.logics;

public class Missing_Array {
public static void main(String[] args) {
	int[] arr= {1,2,3,3,5};
	int n=arr.length+1;
	if(n%2==1)
	{
		int middileindex=n/2;// length is odd
		System.out.println(arr[middileindex]);
	}else {// lenth is even
		
		int middle1=(n/2)-1;
		int middle2=n/2;
		System.out.println("if the lenth is even\n the middle elemenst are "+arr[middle1]+" "+arr[middle2]);
	}
}
}
