package java_logics.logics;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

	public static void main(String[] args) {
		for (int j = 1; j <= 30; j++) {
			int number = j;

			if (isHappyNumber(number)) {
				System.out.println(number + " is a Happy number");
			}
		}
	}

	// Function to check if a number is a Happy number
	private static boolean isHappyNumber(int no) {
		Set<Integer> set = new HashSet<>();

		while (no != 1 && !set.contains(no)) {
			set.add(no);
			no = sumSquare(no);
		}

		return no == 1;
	}

	// Function to calculate the sum of squares of digits of a number
	private static int sumSquare(int no) {
		int sum = 0;
		while (no > 0) {
			int rem = no % 10;
			sum += rem * rem;
			no /= 10;
		}
		return sum;
	}
}
