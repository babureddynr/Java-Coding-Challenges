package java_logics.logics;

public class SecondLargest {

	public static void main(String[] args) {
		// Input array
		int[] arr = {1,2,3,4 };

		int lowest = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;

		for (int num : arr) {
			if (num < lowest)

			{
				second = lowest;
				lowest = num;

			} else if (num < second && num != lowest) {
				second = num;
			}
		}
		System.out.println(second);
	}
}