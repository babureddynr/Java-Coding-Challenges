package Java_Programming;

public class Non_Static {
	public int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {

		Non_Static s1 = new Non_Static();
		System.out.println(s1.add(12, 12));
	}

}
