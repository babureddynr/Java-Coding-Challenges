package java_logics.logics;

import java.util.HashSet;

public class Panagram {

	public static void main(String[] args) {

		String str = "the quick brown fox jumps over the lazy dog";
		ispana(str);
	}

	private static void ispana(String str) {

		HashSet<Character> set = new HashSet<>();
		for (char words : str.toLowerCase().toCharArray()) {
			if (words >= 'a' && words <= 'z') {
				set.add(words);
			}
		}
		if (set.size() == 26) {
			System.out.println("panagram");
		} else {
			System.out.println("not an panagram");
		}

	}

}
