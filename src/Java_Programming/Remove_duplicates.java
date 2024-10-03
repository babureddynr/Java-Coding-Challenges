package Java_Programming;

import java.util.HashSet;

public class Remove_duplicates {
	public static void main(String[] args) {
	String str="heloohhhh";
	int count=0;
	HashSet<Character> set= new HashSet<>();
	for(char c: str.toCharArray())
	{
		if(!set.add(c))
		{
			count++;
			System.out.println(c+" : is the duplucate charcter ");
		}
	}
System.out.println(count+" the total duplicate charcters");
	
	}
}
