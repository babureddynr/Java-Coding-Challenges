package java_logics.logics;

public class Br_Pattern {

	public static void main(String[] args) {

		int rows = 2;
		for (int i = rows; i >= 0; i--) {
			for (int j = rows; j >= rows; j--) {
				System.out.print(" ");

			}
			for (int k = 3; k >= 0; k--) {
				System.out.print("'BR'" + " ");

			}

			System.out.println();

		}
		for (int k = 2 - 1; k >= 0; k--) {
			System.out.print(" 'RB'" + "");

		}

		System.out.println();

	}

}
