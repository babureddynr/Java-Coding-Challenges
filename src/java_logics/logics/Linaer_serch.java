package java_logics.logics;

import java.util.HashSet;
import java.util.Set;

public class Linaer_serch {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 9, 7, 3, 4 };
		;
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		for (int num : arr1) {
			set1.add(num);

		}
		for (int num : arr2) {
			set2.add(num);
		}
		set1.retainAll(set2);
		System.out.println("the repeated elements :" + set1);
	}
}
