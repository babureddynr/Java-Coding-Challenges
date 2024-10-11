package Java_Programming;

public class Thread_Sleep extends Thread {
	public void run() {
		try {

			Thread.sleep(2000);
			System.out.println("Thread is wake up after the 2 seconds");
		} catch (InterruptedException e) {
		
		}
	}

	public static void main(String[] args) {

		Thread_Sleep t1 = new Thread_Sleep();
		t1.start();
	}

}
