package java_logics.logics;

public class Factorial {
public static void main(String[] args) 
{

	for(int j=1; j<=100; j++)
	{
		 boolean flag=true;
		int no=j;
		  
		for(int i=2; i<no; i++)
		{
			if(no%i==0)
			{
				flag=false;
				break;
			}
		}
	
	if(flag)
	{
		System.out.println(no+ "Its a prime number");
	}else {
		System.out.println(no+ "Its not an prime number");
	}
} 
}
}