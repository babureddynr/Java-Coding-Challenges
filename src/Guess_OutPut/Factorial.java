package Guess_OutPut;

public class Factorial {

	public static void main(String[] args) {
	
		for (int j = 1; j <= 20; j++) {

			int no = j;
			int mul = 1;

			for (int i = no; i >= 1; i--) {
				mul = mul * i;
			}
			System.out.println(mul);
		}

	}
}