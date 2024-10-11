package Guess_OutPut;

public class Remove_Concurrency_Reverse {
public static void main(String[] args) {
	String str="jayashree";
String reverse="";
str=str.replaceAll("a", "");

for(int i=str.length()-1; i>=0; i--)
{
	reverse=reverse+str.charAt(i);
}
System.out.println(reverse);
}
}
