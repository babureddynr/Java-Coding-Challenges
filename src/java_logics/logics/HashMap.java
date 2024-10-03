package java_logics.logics;


public class HashMap {

	public static void main(String[] args) {
		int no=5;
		int sum=0;
		int copy=no;
		int n1=no;
		int count=0;
		while(n1!=0)
		{
			n1=n1/10;
			count++;
		}
		while(no!=0)
		{
			int rem=no%10;
			sum+=Math.pow(count, rem);
			no=no/10;
	
		}
		if(sum==copy)
		{
			System.out.println("Armstrong no");
		}else {
			System.out.println("Not an armstrong no");
		}
	}
}