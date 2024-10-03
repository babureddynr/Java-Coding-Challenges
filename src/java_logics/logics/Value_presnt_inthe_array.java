package java_logics.logics;

public class Value_presnt_inthe_array {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 9, 7, 7 };
		int target = 3;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				System.out.println("The values is presnt -> " + arr[i]);
				return;
			}
		}
	}
}
