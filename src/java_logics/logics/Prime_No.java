package java_logics.logics;

public class Prime_No {

	public static void main(String[] args) {
		for (int j = 1; j <= 200; j++) {

			int no = j;
			int copy = no;
			int sum = 0;

			while (no != 0) {
				int rem = no % 10;
				sum = sum + fact(rem);
				no = no / 10;
			}
			if (copy == sum) {
				System.out.println(copy + " Strongn number");

			}
		}
	}

	private static int fact(int no) {
		// TODO Auto-generated method stub
		int mul = 1;
		for (int i = no; i >= 1; i--) {
			mul = mul * i;
		}
		return mul;
	}
}