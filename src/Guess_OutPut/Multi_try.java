package Guess_OutPut;

public class Multi_try {
public static void main(String[] args) {
	try {
		try {
			int res=10/0;
			
		}catch(ArithmeticException e)
		{
			System.out.println("You cannot divide by zero catch 1");
		}
		int[] arr= new int[2];
		arr[3]=3;
	}catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e+" You enter the \narrya index out of bounds value");
	}
}
}
