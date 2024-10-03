package java_logics.logics;
import java.util.Set;
import java.util.TreeSet;
public class Sorting 

{
	public static void main(String[] args) {

		int[] arr = { 8, 2, 3, 1, 0 };
		Set<Integer> set = new TreeSet<Integer>();
		for (int num : arr) {
			set.add(num);
		}
		System.out.println(set);
	}

}