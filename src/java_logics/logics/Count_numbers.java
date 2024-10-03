/**
 * 
 */
package java_logics.logics;
public class Count_numbers {

	public static void main(String[] args) {
	int no=1234000;
	int count=0;
	while(no>0)
	{
		int rem=no%10;
		count++;
		no=no/10;
	}
	System.out.println(count);
	}

}
