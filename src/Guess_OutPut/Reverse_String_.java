package Guess_OutPut;

public class Reverse_String_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="mom";
String reverse="";
for(int i=str.length()-1; i>=0; i--)
{
	reverse=reverse+str.charAt(i);
}
System.out.println(reverse+"-> The reversd String");
if(str.equals(reverse))
{
	System.out.println("Palindrome");
}else {
	System.out.println("Not an Palindrome");
}
	}

}
