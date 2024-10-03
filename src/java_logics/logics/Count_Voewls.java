package java_logics.logics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Count_Voewls {
	public static void main(String[] args) {
		String str="cat";
		String str1="act";
		char[] s1=str.toCharArray();
		char[] s2=str1.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);

		if(Arrays.equals(s1, s2))
		{
			System.out.println("Anagram");
		}else {
			System.out.println("panagram");
		}
	}
}
