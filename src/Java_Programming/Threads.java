package Java_Programming;

public class Threads extends Thread {

	public void run()

	{
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Threads t1 = new Threads(); // Renamed to match class name
		t1.start();
	}
}
