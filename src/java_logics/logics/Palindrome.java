package java_logics.logics;

public class Palindrome {
public static void main(String[] args) {
	String str="mom";
	String reverse="";
	for(int i=str.length()-1; i>=0;i--)
	{
		reverse=reverse+str.charAt(i);
	}
	if(reverse.equals(str))
	{
		System.out.println(str+" : palindrome");
	}else {
		System.out.println("not a palindrome");
	}
}
}
